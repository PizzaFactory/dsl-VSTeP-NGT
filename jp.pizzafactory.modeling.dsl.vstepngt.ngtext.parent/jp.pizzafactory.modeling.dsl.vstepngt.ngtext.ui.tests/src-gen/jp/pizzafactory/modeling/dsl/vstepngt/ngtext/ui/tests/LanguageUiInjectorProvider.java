/*
 * generated by Xtext 2.10.0
 */
package jp.pizzafactory.modeling.dsl.vstepngt.ngtext.ui.tests;

import com.google.inject.Injector;
import jp.pizzafactory.modeling.dsl.vstepngt.ngtext.ui.internal.NgtextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class LanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return NgtextActivator.getInstance().getInjector("jp.pizzafactory.modeling.dsl.vstepngt.ngtext.Language");
	}

}
