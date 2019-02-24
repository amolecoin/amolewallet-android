package com.amolecoin.exceptions;

import java.security.GeneralSecurityException;

/**
 * AmoleWallet
 * <p>
 * Created by Mihail Gutan <mihail@amolecoin.com> on 11/16/15.
 * Copyright (c) 2016 amolecoin LLC
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

public class CertificateChainNotFound extends GeneralSecurityException {
    public static final String TAG = CertificateChainNotFound.class.getName();

    private CertificateChainNotFound() {
        super();
    }

    public CertificateChainNotFound(String msg) {
        super(msg);
    }

    private CertificateChainNotFound(String msg, Throwable cause) {
        super(msg, cause);
    }

    private CertificateChainNotFound(Throwable cause) {
        super(cause);
    }

}

