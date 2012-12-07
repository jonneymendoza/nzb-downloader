
package com.josh.nzb.downloader.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



/**
 * @author RichardsJ
 *
 */
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface JsonElement {
	JsonType type() default JsonType.OTHER;
}
