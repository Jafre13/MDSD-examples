/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.MathDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MathDslStandaloneSetup extends MathDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MathDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
