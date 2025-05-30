/**
 * generated by Xtext 2.36.0
 */
package org.xixum.nlx.naturalLang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xixum.nlx.naturalLang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xixum.nlx.naturalLang.NaturalLangPackage
 * @generated
 */
public class NaturalLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NaturalLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NaturalLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaturalLangSwitch<Adapter> modelSwitch =
    new NaturalLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSentenceType(SentenceType object)
      {
        return createSentenceTypeAdapter();
      }
      @Override
      public Adapter caseParagraphBlock(ParagraphBlock object)
      {
        return createParagraphBlockAdapter();
      }
      @Override
      public Adapter caseBlockElement(BlockElement object)
      {
        return createBlockElementAdapter();
      }
      @Override
      public Adapter caseFootNote(FootNote object)
      {
        return createFootNoteAdapter();
      }
      @Override
      public Adapter caseTableLine(TableLine object)
      {
        return createTableLineAdapter();
      }
      @Override
      public Adapter caseTableBorder(TableBorder object)
      {
        return createTableBorderAdapter();
      }
      @Override
      public Adapter caseTableRow(TableRow object)
      {
        return createTableRowAdapter();
      }
      @Override
      public Adapter caseTableColumnSeparator(TableColumnSeparator object)
      {
        return createTableColumnSeparatorAdapter();
      }
      @Override
      public Adapter caseTable(Table object)
      {
        return createTableAdapter();
      }
      @Override
      public Adapter caseLineSentenceChain(LineSentenceChain object)
      {
        return createLineSentenceChainAdapter();
      }
      @Override
      public Adapter caseSentenceChain(SentenceChain object)
      {
        return createSentenceChainAdapter();
      }
      @Override
      public Adapter caseSentenceChainX(SentenceChainX object)
      {
        return createSentenceChainXAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseLineSentence(LineSentence object)
      {
        return createLineSentenceAdapter();
      }
      @Override
      public Adapter caseFreeSentence(FreeSentence object)
      {
        return createFreeSentenceAdapter();
      }
      @Override
      public Adapter caseSentenceX(SentenceX object)
      {
        return createSentenceXAdapter();
      }
      @Override
      public Adapter caseListSentence(ListSentence object)
      {
        return createListSentenceAdapter();
      }
      @Override
      public Adapter caseChapterSentence(ChapterSentence object)
      {
        return createChapterSentenceAdapter();
      }
      @Override
      public Adapter caseSubSentence(SubSentence object)
      {
        return createSubSentenceAdapter();
      }
      @Override
      public Adapter caseTrailSubSentence(TrailSubSentence object)
      {
        return createTrailSubSentenceAdapter();
      }
      @Override
      public Adapter caseFreeSubSentence(FreeSubSentence object)
      {
        return createFreeSubSentenceAdapter();
      }
      @Override
      public Adapter caseLineSubSentence(LineSubSentence object)
      {
        return createLineSubSentenceAdapter();
      }
      @Override
      public Adapter caseNoNElement(NoNElement object)
      {
        return createNoNElementAdapter();
      }
      @Override
      public Adapter caseBrackets(Brackets object)
      {
        return createBracketsAdapter();
      }
      @Override
      public Adapter caseNoNElementX(NoNElementX object)
      {
        return createNoNElementXAdapter();
      }
      @Override
      public Adapter caseNoNElementX2(NoNElementX2 object)
      {
        return createNoNElementX2Adapter();
      }
      @Override
      public Adapter caseElements(Elements object)
      {
        return createElementsAdapter();
      }
      @Override
      public Adapter caseAllElements(AllElements object)
      {
        return createAllElementsAdapter();
      }
      @Override
      public Adapter caseBracketSentence(BracketSentence object)
      {
        return createBracketSentenceAdapter();
      }
      @Override
      public Adapter caseWord(Word object)
      {
        return createWordAdapter();
      }
      @Override
      public Adapter caseWordShort(WordShort object)
      {
        return createWordShortAdapter();
      }
      @Override
      public Adapter caseItWord(ItWord object)
      {
        return createItWordAdapter();
      }
      @Override
      public Adapter caseQuote(Quote object)
      {
        return createQuoteAdapter();
      }
      @Override
      public Adapter caseUnit(Unit object)
      {
        return createUnitAdapter();
      }
      @Override
      public Adapter caseSimpleUnit(SimpleUnit object)
      {
        return createSimpleUnitAdapter();
      }
      @Override
      public Adapter caseChapter_Unit_HI(Chapter_Unit_HI object)
      {
        return createChapter_Unit_HIAdapter();
      }
      @Override
      public Adapter caseChapter_Unit_Low(Chapter_Unit_Low object)
      {
        return createChapter_Unit_LowAdapter();
      }
      @Override
      public Adapter caseHashNumber(HashNumber object)
      {
        return createHashNumberAdapter();
      }
      @Override
      public Adapter caseChapterAlpha(ChapterAlpha object)
      {
        return createChapterAlphaAdapter();
      }
      @Override
      public Adapter caseSymbolsX(SymbolsX object)
      {
        return createSymbolsXAdapter();
      }
      @Override
      public Adapter caseSymbols(Symbols object)
      {
        return createSymbolsAdapter();
      }
      @Override
      public Adapter caseShortcutGen(ShortcutGen object)
      {
        return createShortcutGenAdapter();
      }
      @Override
      public Adapter caseShortcutLib(ShortcutLib object)
      {
        return createShortcutLibAdapter();
      }
      @Override
      public Adapter caseShortCut(ShortCut object)
      {
        return createShortCutAdapter();
      }
      @Override
      public Adapter caseIgnoredText(IgnoredText object)
      {
        return createIgnoredTextAdapter();
      }
      @Override
      public Adapter caseUrlAdress(UrlAdress object)
      {
        return createUrlAdressAdapter();
      }
      @Override
      public Adapter caseEmailAT(EmailAT object)
      {
        return createEmailATAdapter();
      }
      @Override
      public Adapter caseMailAdress(MailAdress object)
      {
        return createMailAdressAdapter();
      }
      @Override
      public Adapter caseFormula(Formula object)
      {
        return createFormulaAdapter();
      }
      @Override
      public Adapter caseArray(Array object)
      {
        return createArrayAdapter();
      }
      @Override
      public Adapter caseNew_Line(New_Line object)
      {
        return createNew_LineAdapter();
      }
      @Override
      public Adapter caseExtBracketSentence(ExtBracketSentence object)
      {
        return createExtBracketSentenceAdapter();
      }
      @Override
      public Adapter caseEString(EString object)
      {
        return createEStringAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SentenceType <em>Sentence Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SentenceType
   * @generated
   */
  public Adapter createSentenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ParagraphBlock <em>Paragraph Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ParagraphBlock
   * @generated
   */
  public Adapter createParagraphBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.BlockElement <em>Block Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.BlockElement
   * @generated
   */
  public Adapter createBlockElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.FootNote <em>Foot Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.FootNote
   * @generated
   */
  public Adapter createFootNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.TableLine <em>Table Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.TableLine
   * @generated
   */
  public Adapter createTableLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.TableBorder <em>Table Border</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.TableBorder
   * @generated
   */
  public Adapter createTableBorderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.TableRow <em>Table Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.TableRow
   * @generated
   */
  public Adapter createTableRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.TableColumnSeparator <em>Table Column Separator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.TableColumnSeparator
   * @generated
   */
  public Adapter createTableColumnSeparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Table
   * @generated
   */
  public Adapter createTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.LineSentenceChain <em>Line Sentence Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.LineSentenceChain
   * @generated
   */
  public Adapter createLineSentenceChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SentenceChain <em>Sentence Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SentenceChain
   * @generated
   */
  public Adapter createSentenceChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SentenceChainX <em>Sentence Chain X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SentenceChainX
   * @generated
   */
  public Adapter createSentenceChainXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.LineSentence <em>Line Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.LineSentence
   * @generated
   */
  public Adapter createLineSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.FreeSentence <em>Free Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.FreeSentence
   * @generated
   */
  public Adapter createFreeSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SentenceX <em>Sentence X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SentenceX
   * @generated
   */
  public Adapter createSentenceXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ListSentence <em>List Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ListSentence
   * @generated
   */
  public Adapter createListSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ChapterSentence <em>Chapter Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ChapterSentence
   * @generated
   */
  public Adapter createChapterSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SubSentence <em>Sub Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SubSentence
   * @generated
   */
  public Adapter createSubSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.TrailSubSentence <em>Trail Sub Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.TrailSubSentence
   * @generated
   */
  public Adapter createTrailSubSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.FreeSubSentence <em>Free Sub Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.FreeSubSentence
   * @generated
   */
  public Adapter createFreeSubSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.LineSubSentence <em>Line Sub Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.LineSubSentence
   * @generated
   */
  public Adapter createLineSubSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.NoNElement <em>No NElement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.NoNElement
   * @generated
   */
  public Adapter createNoNElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Brackets
   * @generated
   */
  public Adapter createBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.NoNElementX <em>No NElement X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.NoNElementX
   * @generated
   */
  public Adapter createNoNElementXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.NoNElementX2 <em>No NElement X2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.NoNElementX2
   * @generated
   */
  public Adapter createNoNElementX2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Elements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Elements
   * @generated
   */
  public Adapter createElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.AllElements <em>All Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.AllElements
   * @generated
   */
  public Adapter createAllElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.BracketSentence <em>Bracket Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.BracketSentence
   * @generated
   */
  public Adapter createBracketSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Word
   * @generated
   */
  public Adapter createWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.WordShort <em>Word Short</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.WordShort
   * @generated
   */
  public Adapter createWordShortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ItWord <em>It Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ItWord
   * @generated
   */
  public Adapter createItWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Quote <em>Quote</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Quote
   * @generated
   */
  public Adapter createQuoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Unit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Unit
   * @generated
   */
  public Adapter createUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SimpleUnit <em>Simple Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SimpleUnit
   * @generated
   */
  public Adapter createSimpleUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Chapter_Unit_HI <em>Chapter Unit HI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Chapter_Unit_HI
   * @generated
   */
  public Adapter createChapter_Unit_HIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Chapter_Unit_Low <em>Chapter Unit Low</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Chapter_Unit_Low
   * @generated
   */
  public Adapter createChapter_Unit_LowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.HashNumber <em>Hash Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.HashNumber
   * @generated
   */
  public Adapter createHashNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ChapterAlpha <em>Chapter Alpha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ChapterAlpha
   * @generated
   */
  public Adapter createChapterAlphaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.SymbolsX <em>Symbols X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.SymbolsX
   * @generated
   */
  public Adapter createSymbolsXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Symbols <em>Symbols</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Symbols
   * @generated
   */
  public Adapter createSymbolsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ShortcutGen <em>Shortcut Gen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ShortcutGen
   * @generated
   */
  public Adapter createShortcutGenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ShortcutLib <em>Shortcut Lib</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ShortcutLib
   * @generated
   */
  public Adapter createShortcutLibAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ShortCut <em>Short Cut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ShortCut
   * @generated
   */
  public Adapter createShortCutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.IgnoredText <em>Ignored Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.IgnoredText
   * @generated
   */
  public Adapter createIgnoredTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.UrlAdress <em>Url Adress</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.UrlAdress
   * @generated
   */
  public Adapter createUrlAdressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.EmailAT <em>Email AT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.EmailAT
   * @generated
   */
  public Adapter createEmailATAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.MailAdress <em>Mail Adress</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.MailAdress
   * @generated
   */
  public Adapter createMailAdressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Formula
   * @generated
   */
  public Adapter createFormulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.Array
   * @generated
   */
  public Adapter createArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.New_Line <em>New Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.New_Line
   * @generated
   */
  public Adapter createNew_LineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.ExtBracketSentence <em>Ext Bracket Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.ExtBracketSentence
   * @generated
   */
  public Adapter createExtBracketSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xixum.nlx.naturalLang.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xixum.nlx.naturalLang.EString
   * @generated
   */
  public Adapter createEStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NaturalLangAdapterFactory
