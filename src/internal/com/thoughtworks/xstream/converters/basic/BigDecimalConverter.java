/*
 * Copyright (C) 2004 Joe Walnes.
 * Copyright (C) 2006, 2007 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 * 
 * Created on 07. May 2004 by Joe Walnes
 */
package internal.com.thoughtworks.xstream.converters.basic;

import java.math.BigDecimal;

/**
 * Converts a java.math.BigDecimal to a String, retaining
 * its precision.
 *
 * @author Joe Walnes
 */
public class BigDecimalConverter extends AbstractSingleValueConverter {

    public boolean canConvert(Class type) {
        return type.equals(BigDecimal.class);
    }

    public Object fromString(String str) {
        return new BigDecimal(str);
    }

}
