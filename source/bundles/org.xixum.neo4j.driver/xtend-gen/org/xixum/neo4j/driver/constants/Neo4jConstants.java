package org.xixum.neo4j.driver.constants;

import org.xixum.neo4j.driver.activator.PluginUtils;

@SuppressWarnings("all")
public class Neo4jConstants {
  public static final String DB_URI = "neo4j://localhost";

  public static final String DB_USER = "neo4j";

  public static final String DB_PASS = "test1234";

  public static final String _NODE = Neo4jConstants.getString("_NODE");

  public static final String _NAME = Neo4jConstants.getString("_NAME");

  public static final String _LINK = Neo4jConstants.getString("_LINK");

  public static final String _TARGET = Neo4jConstants.getString("_TARGET");

  public static final String _SOURCE = Neo4jConstants.getString("_SOURCE");

  public static final String _ATTR_NAME = Neo4jConstants.getString("_ATTR_NAME");

  public static final String _ID = Neo4jConstants.getString("_ID");

  public static final String _VALUE = Neo4jConstants.getString("_VALUE");

  public static final String _TOKEN = Neo4jConstants.getString("_TOKEN");

  public static final String ARROW_ = Neo4jConstants.getString("ARROW_");

  public static final String FIRST_ = Neo4jConstants.getString("FIRST_");

  public static final String SECOND_ = Neo4jConstants.getString("SECOND_");

  public static final String START_ = Neo4jConstants.getString("START_");

  public static final String END_ = Neo4jConstants.getString("END_");

  public static final String _CLASS = Neo4jConstants.getString("_CLASS");

  public static final String _OF_CLASS = Neo4jConstants.getString("_OF_CLASS");

  public static final String _SUBCLASS_OF = Neo4jConstants.getString("_SUBCLASS_OF");

  public static final String _LINK2 = Neo4jConstants.getString("_LINK2");

  public static final String _NODE2 = Neo4jConstants.getString("_NODE2");

  public static final String _A = Neo4jConstants.getString("_A");

  public static final String _B = Neo4jConstants.getString("_B");

  public static final String _C = Neo4jConstants.getString("_C");

  public static final String _D = Neo4jConstants.getString("_D");

  public static final String _E = Neo4jConstants.getString("_E");

  public static final String _F = Neo4jConstants.getString("_F");

  public static final String _G = Neo4jConstants.getString("_G");

  public static final String _H = Neo4jConstants.getString("_H");

  public static final String _I = Neo4jConstants.getString("_I");

  public static final String _IT = Neo4jConstants.getString("_IT");

  public static final String _CL = Neo4jConstants.getString("_CL");

  public static final String _LS = Neo4jConstants.getString("_LS");

  public static final String _T = Neo4jConstants.getString("_T");

  public static final String _S = Neo4jConstants.getString("_S");

  public static final String _SC = Neo4jConstants.getString("_SC");

  public static final String _L = Neo4jConstants.getString("_L");

  public static final String _L1 = Neo4jConstants.getString("_L1");

  public static final String _L2 = Neo4jConstants.getString("_L2");

  public static final String _L3 = Neo4jConstants.getString("_L3");

  public static final String _N = Neo4jConstants.getString("_N");

  public static final String _N2 = Neo4jConstants.getString("_N2");

  public static final String _R = Neo4jConstants.getString("_R");

  public static final String _P = Neo4jConstants.getString("_P");

  public static final String _LK = Neo4jConstants.getString("_LK");

  public static final String _LI = Neo4jConstants.getString("_LI");

  public static final String _LL = Neo4jConstants.getString("_LL");

  public static final String _LA = Neo4jConstants.getString("_LA");

  public static final String _ND = Neo4jConstants.getString("_ND");

  public static final String _NI = Neo4jConstants.getString("_NI");

  public static final String _NL = Neo4jConstants.getString("_NL");

  public static final String _NA = Neo4jConstants.getString("_NA");

  public static final String _X = Neo4jConstants.getString("_X");

  public static final String _HIT = Neo4jConstants.getString("_HIT");

  public static final String _ATTR = Neo4jConstants.getString("_ATTR");

  public static final String _ATTRS = Neo4jConstants.getString("_ATTRS");

  public static final String _INDEX = Neo4jConstants.getString("_INDEX");

  public static final String _OVER_COMMA = Neo4jConstants.getString("_OVER_COMMA");

  public static final String CLUSTER_FAMILY_ = Neo4jConstants.getString("CLUSTER_FAMILY_");

  public static final String ALL_CLUSTERS_ = Neo4jConstants.getString("ALL_CLUSTERS_");

  public static final String CLUSTER_TYPE_ = Neo4jConstants.getString("CLUSTER_TYPE_");

  public static final String _MID = Neo4jConstants.getString("_MID");

  public static final String _IN_BOX = Neo4jConstants.getString("_IN_BOX");

  public static final String _OUT_BOX = Neo4jConstants.getString("_OUT_BOX");

  private static String getString(final String key) {
    return PluginUtils.INSTANCE.getString(key).trim();
  }
}
