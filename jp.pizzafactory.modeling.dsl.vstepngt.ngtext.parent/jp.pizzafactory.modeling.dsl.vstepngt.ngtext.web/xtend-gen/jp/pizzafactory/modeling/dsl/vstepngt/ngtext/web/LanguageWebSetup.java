/**
 * generated by Xtext 2.10.0
 */
package jp.pizzafactory.modeling.dsl.vstepngt.ngtext.web;

import com.google.inject.Injector;
import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import jp.pizzafactory.modeling.dsl.vstepngt.ngtext.LanguageStandaloneSetup;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class LanguageWebSetup extends LanguageStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    throw new Error("Unresolved compilation problems:"
      + "\nLanguageRuntimeModule cannot be resolved."
      + "\nType mismatch: cannot convert from LanguageWebModule to Iterable<? extends Module>");
  }
  
  public LanguageWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
