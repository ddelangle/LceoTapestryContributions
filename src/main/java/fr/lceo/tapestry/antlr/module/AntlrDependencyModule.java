/**
 * ===========================================================================================
 * Copyright © LCEO SAS 2008-2010 Tous droits réservés.
 *
 * <b>Attention</b> : ce logiciel est protégé par la loi sur le copyright et les conventions
 * internationales. Toute reproduction ou distribution partielle ou totale du logiciel, par
 * tout moyen, est strictement interdite. Quiconque ne respecte pas ces dispositions se rend
 * coupable du délit de contrefaçon et sera passible de sanctions pénales prévues par la loi.
 *
 ********
 *
 * Copyright © 2008-2010 LCEO SAS. All rights reserved.
 *
 * <b>Warning</b> : this software is protected under copyright laws and by international
 * conventions. Any replication or global or partial spread of this software, by any means
 * is absolutely forbidden. Whoever does not respect this clauses is guilty of infringement
 * of copyright and will be indictable.
 * ===========================================================================================
 *
 * <b>Nom produit</b> : tapestry-antlr
 * <b>Organisation</b> : LCEO SAS
 * <b>Description</b> : 
 * <b>Marques légales</b> : Bus_data (r), LCEO (r), Sequelo (r)
 * <b>Fichier</b> : AntlrDependencyModule.java
 * <b>Créé le</b> : 24 août 2010
 *
 */
package fr.lceo.tapestry.antlr.module;

import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Local;
import org.apache.tapestry5.services.PropertyConduitSource;

import fr.lceo.tapestry.antlr.services.PropertyConduitSourceImpl;

public class AntlrDependencyModule {

	public static void bind(ServiceBinder binder) {
		binder.bind(PropertyConduitSource.class, PropertyConduitSourceImpl.class).withId("OverridePropertyConduitSource");
	}

	public static void contributeServiceOverride(MappedConfiguration<Class, Object> configuration, @Local PropertyConduitSource conduitSource) {
		configuration.add(PropertyConduitSource.class, conduitSource);
	}

}
