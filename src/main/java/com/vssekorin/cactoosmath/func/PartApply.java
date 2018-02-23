/**
 * MIT License
 *
 * Copyright (c) 2017-2018 Vseslav Sekorin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.vssekorin.cactoosmath.func;

import org.cactoos.BiFunc;
import org.cactoos.Func;

/**
 * Partial function application.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @param <X> First input type
 * @param <Y> Second input type
 * @param <Z> Result type
 * @since 0.1
 */
public final class PartApply<X, Y, Z> implements Func<Y, Z> {

    /**
     * Origin function.
     */
    private final BiFunc<X, Y, Z> func;

    /**
     * First argument.
     */
    private final X first;

    /**
     * Ctor.
     * @param fnc Function of two arguments
     * @param arg First argument
     */
    public PartApply(final BiFunc<X, Y, Z> fnc, final X arg) {
        this.func = fnc;
        this.first = arg;
    }

    @Override
    public Z apply(final Y input) throws Exception {
        return this.func.apply(this.first, input);
    }
}
