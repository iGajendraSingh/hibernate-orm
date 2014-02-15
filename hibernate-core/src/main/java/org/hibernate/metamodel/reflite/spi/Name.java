/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2014, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.reflite.spi;

/**
 * Represents a name in a typed fashion rather than simple strings.Generally this
 * refers to a package or class name.
 * <p/>
 * Modelled after Jandex's DotName, which is modelled after {@link javax.naming.Name}, etc
 *
 * @author Steve Ebersole
 */
public interface Name {
	/**
	 * The name qualifier (e.g. the package name for a class)
	 *
	 * @return The qualifier
	 */
	public String getQualifier();

	/**
	 * The unqualified portion of the name (e.e. the name of the class without
	 * its package).
	 *
	 * @return The unqualified name
	 */
	public String getUnqualifiedName();

	/**
	 * The full name (qualifier + unqualified)
	 *
	 * @return The full name
	 */
	public String fullName();
}
