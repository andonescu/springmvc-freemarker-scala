/**
 *
 */
package com.endava.andonescu.demos.springfreemarker.webforms;

import org.springframework.validation.BindingResult;

import java.io.Serializable;

/**
 * @author iandonescu
 */
public abstract class AbstractForm implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    abstract void additionalVerification(BindingResult bindingResult);
}
