package com.tugalsan.api.pack.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TGS_Pack4<A, B, C, D> implements IsSerializable {

    public TGS_Pack4() {//DTO
    }

    public TGS_Pack4(A value0, B value1, C value2, D value3) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    public A value0;
    public B value1;
    public C value2;
    public D value3;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value0 + "," + value1 + "," + value2 + "," + value3 + "]";
    }

    public boolean isEmpty() {
        return value0 == null;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    public static <A, B, C, D> TGS_Pack4<A, B, C, D> of(A value0, B value1, C value2, D value3) {
        return new TGS_Pack4(value0, value1, value2, value3);
    }

    public static <A, B, C, D> TGS_Pack4<A, B, C, D> of() {
        return new TGS_Pack4();
    }
}
