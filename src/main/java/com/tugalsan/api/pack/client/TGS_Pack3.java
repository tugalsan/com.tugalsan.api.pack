package com.tugalsan.api.pack.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TGS_Pack3<A, B, C> implements IsSerializable {

    public TGS_Pack3() {//DTO
    }

    public TGS_Pack3(A value0, B value1, C value2) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
    }
    public A value0;
    public B value1;
    public C value2;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value0 + "," + value1 + "," + value2 + "]";
    }

    public boolean isEmpty() {
        return value0 == null;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    public static <A, B, C> TGS_Pack3<A, B, C> of(A value0, B value1, C value2) {
        return new TGS_Pack3(value0, value1, value2);
    }

    public static <A, B, C> TGS_Pack3<A, B, C> of() {
        return new TGS_Pack3();
    }
}
