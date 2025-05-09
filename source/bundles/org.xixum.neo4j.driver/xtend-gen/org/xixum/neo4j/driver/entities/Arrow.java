/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package org.xixum.neo4j.driver.entities;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntPredicate;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xixum.neo4j.driver.constants.Direction;

@SuppressWarnings("all")
public class Arrow {
  private String varName;

  private String classT;

  private Direction direction;

  private Map<String, Serializable> attribs;

  private boolean usePath;

  private String min;

  private String max;

  public Arrow(final String varName, final String classT, final Direction direction) {
    this(varName, classT, null, true, direction);
  }

  public Arrow(final String varName, final String classT, final Map<String, Serializable> attribs, final Direction direction) {
    this(varName, classT, attribs, null, null, false, direction);
  }

  /**
   * @Deprecated
   * deprecated interface because useQuotes is determined dynamically
   */
  @Deprecated
  public Arrow(final String varName, final String classT, final Map<String, Serializable> attribs, final boolean useQuotes, final Direction direction) {
    this(varName, classT, attribs, null, null, false, direction);
  }

  @Deprecated
  public Arrow(final String varName, final String classT, final Map<String, Serializable> attribs, final String min, final String max, final boolean usePath, final boolean useQuotes, final Direction direction) {
    this(varName, classT, attribs, min, max, usePath, direction);
  }

  public Arrow(final String varName, final String classT, final Map<String, Serializable> attribs, final String min, final String max, final boolean usePath, final Direction direction) {
    this.varName = varName;
    this.classT = classT;
    this.direction = direction;
    this.attribs = attribs;
    this.min = min;
    this.max = max;
    this.usePath = usePath;
  }

  public String getVarName() {
    return this.varName;
  }

  public String getClassT() {
    return this.classT;
  }

  public Direction getDirection() {
    return this.direction;
  }

  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equals(this.direction, Direction.LEFT);
      if (_equals) {
        _builder.append("<-");
      } else {
        _builder.append("-");
      }
    }
    _builder.append("[");
    {
      if ((this.varName != null)) {
        _builder.append(this.varName);
      }
    }
    {
      if ((this.classT != null)) {
        _builder.append(":");
        _builder.append(this.classT);
      }
    }
    _builder.append(" ");
    {
      if (((this.attribs != null) && (!this.attribs.isEmpty()))) {
        _builder.append("{");
        {
          Set<String> _keySet = this.attribs.keySet();
          boolean _hasElements = false;
          for(final String attr : _keySet) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(attr);
            _builder.append(":");
            {
              boolean _requirequotes = this.requirequotes(this.attribs.get(attr));
              if (_requirequotes) {
                _builder.append("\"");
                Serializable _get = this.attribs.get(attr);
                _builder.append(_get);
                _builder.append("\"");
              } else {
                Serializable _get_1 = this.attribs.get(attr);
                _builder.append(_get_1);
              }
            }
          }
        }
        _builder.append("}");
      }
    }
    {
      if (this.usePath) {
        _builder.append("*");
        {
          if ((this.min != null)) {
            _builder.append(this.min);
            _builder.append("..");
          }
        }
        {
          if ((this.max != null)) {
            _builder.append(this.max);
          }
        }
      }
    }
    _builder.append("]");
    {
      boolean _equals_1 = Objects.equals(this.direction, Direction.RIGHT);
      if (_equals_1) {
        _builder.append("->");
      } else {
        _builder.append("-");
      }
    }
    return _builder;
  }

  public boolean requirequotes(final Serializable attr) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (attr instanceof Number) {
      _matched=true;
      _switchResult = false;
    }
    if (!_matched) {
      if (attr instanceof CharSequence) {
        _matched=true;
        final IntPredicate _function = (int x) -> {
          return Integer.valueOf(x).equals("\"");
        };
        boolean _anyMatch = ((CharSequence)attr).chars().anyMatch(_function);
        _switchResult = (!_anyMatch);
      }
    }
    if (!_matched) {
      _switchResult = true;
    }
    return _switchResult;
  }
}
