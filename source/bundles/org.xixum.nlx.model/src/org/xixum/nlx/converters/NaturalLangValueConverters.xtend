package org.xixum.nlx.converters

import org.eclipse.xtext.xtext.XtextValueConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import com.google.inject.Singleton
import com.google.inject.Inject

@Singleton
class NaturalLangValueConverters extends XtextValueConverters {
	
	@Inject
	protected NlxValueConverter nlxValueConverter
	
	@ValueConverter(rule = "STRING")
	override IValueConverter<String> STRING() {
		nlxValueConverter
	}
	
	@ValueConverter(rule = "org.eclipse.xtext.common.Terminals.STRING")
	override IValueConverter<String> TerminalsSTRING() {
		nlxValueConverter
	}
	
	@ValueConverter(rule = "org.xixum.nlx.naturalLang.STRING")
	def IValueConverter<String> NlxSTRING() {
		nlxValueConverter
	}
	
	@ValueConverter(rule = "org.xixum.nlx.naturalLang.Number")
	def IValueConverter<String> NlxNumber() {
		nlxValueConverter
	}
	
	@ValueConverter(rule = "org.xixum.nlx.naturalLang.ALPHA_NUMERIC_C")
	def IValueConverter<String> NlxAlphaNumeric() {
		nlxValueConverter
	}
}