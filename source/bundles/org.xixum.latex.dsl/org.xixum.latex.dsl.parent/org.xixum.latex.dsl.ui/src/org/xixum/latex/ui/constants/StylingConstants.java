package org.xixum.latex.ui.constants;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.eclipse.emf.edit.provider.StyledString.Style.BorderStyle;
import org.eclipse.emf.edit.provider.StyledString.Style.Builder;
import org.eclipse.emf.edit.provider.StyledString.Style.UnderLineStyle;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class StylingConstants {
	
	public static final URI BLACK = URI.createURI("color://rgb/0/0/0"); //$NON-NLS-1$
	
	public static final URI GREY50 = URI.createURI("color://rgb/128/128/128"); //$NON-NLS-1$
	
	public static final URI GREY70 = URI.createURI("color://rgb/192/192/192"); //$NON-NLS-1$
	
	public static final URI GREY25 = URI.createURI("color://rgb/64/64/64"); //$NON-NLS-1$
	
	public static final URI YELLOW = URI.createURI("color://rgb/255/255/0"); //$NON-NLS-1$
	
	public static final URI ORANGE = URI.createURI("color://rgb/255/128/0"); //$NON-NLS-1$
	
	public static final URI CYAN = URI.createURI("color://rgb/0/255/255"); //$NON-NLS-1$
	
	public static final URI MAGENTA = URI.createURI("color://rgb/255/0/255"); //$NON-NLS-1$
	
	public static final URI RED = URI.createURI("color://rgb/196/0/0"); //$NON-NLS-1$
	
	public static final URI LRED = URI.createURI("color://rgb/255/64/64"); //$NON-NLS-1$
	
	public static final URI BROWN = URI.createURI("color://rgb/196/128/64"); //$NON-NLS-1$
	
	public static final URI GREEN = URI.createURI("color://rgb/0/255/0"); //$NON-NLS-1$
	
	public static final URI DGREEN = URI.createURI("color://rgb/0/196/0"); //$NON-NLS-1$
	
	public static final URI BLUE = URI.createURI("color://rgb/0/0/255"); //$NON-NLS-1$
	
	public static final URI DARK_RED = URI.createURI("color://rgb/128/0/64"); //$NON-NLS-1$
	
	public static final URI DARK_PURPLE = URI.createURI("color://rgb/64/0/128"); //$NON-NLS-1$
	
	public static final URI WHITE = URI.createURI("color://rgb/255/255/255"); //$NON-NLS-1$
	
	public static final StyledString.Style BOLD_DARK_RED = setStyle(
			IItemFontProvider.BOLD_FONT, 
			null, DARK_RED,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style BOLD_LIGHT_RED = setStyle(
			IItemFontProvider.BOLD_FONT, 
			null, LRED,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style BOLD_BROWN = setStyle(
			IItemFontProvider.BOLD_FONT, 
			null, BROWN,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style BOLD_BORDER_BLACK = setStyle(
			IItemFontProvider.BOLD_FONT, 
			null, BLACK,
	        false, null,
	        null, null,
	        BorderStyle.SOLID, BLACK);
	
	public static final StyledString.Style ITALIC_BLACK = setStyle(
			IItemFontProvider.ITALIC_FONT, 
			null, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style ITALIC = setStyle(
			IItemFontProvider.ITALIC_FONT, 
			null, null,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style LRED_BG = setStyle(
			IItemFontProvider.NORMAL_FONT, 
			LRED, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style GREEN_BG = setStyle(
			IItemFontProvider.NORMAL_FONT, 
			GREEN, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style BLUE_BG = setStyle(
			IItemFontProvider.BOLD_FONT, 
			BLUE, WHITE,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style ORANGE_BG = setStyle(
			IItemFontProvider.BOLD_FONT, 
			ORANGE, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	
	public static final StyledString.Style RED_BG = setStyle(
			IItemFontProvider.BOLD_FONT, 
			RED, WHITE,
	        false, null,
	        null, null,
	        null, null);
	
	
	public static final StyledString.Style DGREEN_BG = setStyle(
			IItemFontProvider.BOLD_FONT, 
			DGREEN, WHITE,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style YELLOW_BG = setStyle(
			IItemFontProvider.NORMAL_FONT, 
			YELLOW, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style GREY_BG = setStyle(
			IItemFontProvider.NORMAL_FONT, 
			GREY70, BLACK,
	        false, null,
	        null, null,
	        null, null);
	
	public static final StyledString.Style STRIKETHROUGH_GREY = setStyle(
			IItemFontProvider.NORMAL_FONT, 
			null, GREY50,
	        true, BLACK,
	        null, null,
	        null, null);
	
	private static final Display display = new Display();
	
	public static final Styler BOLD_RED_STYLER = new Styler() {
        @Override
        public void applyStyles(TextStyle textStyle) {
            textStyle.foreground = new Color(display, 255, 0, 0);
            textStyle.font = new Font(display, "Arial", 12, SWT.BOLD);
        }
    };
    
    // Create an italic blue styler
    public static final Styler ITALIC_BLUE = new Styler() {
        @Override
        public void applyStyles(TextStyle textStyle) {
            textStyle.foreground = new Color(display, 0, 0, 255);
            textStyle.font = new Font(display, "Arial", 12, SWT.ITALIC);
        }
    };
	
	
	protected static Style setStyle(URI font, URI backgroundCol, URI foregroundCol, boolean strikeout, URI strikeoutCol, UnderLineStyle underlinestyle,
			URI underlineColor, BorderStyle borderstyle, URI borderColor) {
		
		Builder styler = Style.newBuilder();
		if (font != null)
			styler.setFont(font);
		if (backgroundCol != null)
			styler.setBackgroundColor(backgroundCol);
		if (foregroundCol != null)
			styler.setForegroundColor(foregroundCol);
		if (strikeout)
			styler.setStrikedout(strikeout);
		if (strikeoutCol != null)
			styler.setStrikeoutColor(strikeoutCol);
		if (underlinestyle != null)
			styler.setUnderlineStyle(underlinestyle);
		if (underlineColor != null)
			styler.setUnderlineColor(underlineColor);
		if (borderstyle != null)
			styler.setBorderStyle(borderstyle);
		if (borderColor != null)
			styler.setBorderColor(borderColor);
		
		return styler.toStyle();
	}

}
