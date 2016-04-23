package org.palladiosimulator.xtexttools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.serializer.ISerializer;
import org.palladiosimulator.xtexttools.interfaces.IXProduct;
import org.palladiosimulator.xtexttools.interfaces.IXSerializer;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Abstract class for Xtext serializer adapter.
 * 
 * @author Jonas Heinisch
 *
 */
public abstract class AbstractXtextSerializerAdapter extends IXProduct implements IXSerializer {

    @Inject
    private ISerializer serializer;

    /**
     * Constructor of Serializer adapter. Use this one for eclipse products.
     */
    public AbstractXtextSerializerAdapter() {
        this(false);
    }

    /**
     * Constructor of Serializer adapter.
     * 
     * @param standalone
     *            only true if not an eclipse product.
     */
    public AbstractXtextSerializerAdapter(boolean standalone) {
        if (standalone) {
            for (EPackage pack : registerEPackages()) {
                EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);
            }
        }
        Injector injector;
        if (standalone) {
            injector = getStandaloneSetup().createInjectorAndDoEMFRegistration();
        } else {
            injector = Guice.createInjector(getRuntimeModule());
        }
        injector.injectMembers(this);
    }

    @Override
    public String valueOf(EObject eobj) {
        if (eobj == null) {
            return "null";
        }
        try {
            return serializer.serialize(eobj);
        } catch (Exception ex) { // fall back:
            return eobj.getClass().getSimpleName() + '@' + eobj.hashCode();
        }
    }
}
