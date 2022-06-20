package com.tugalsan.api.pack.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TGS_Pack1<A> implements IsSerializable {

    public TGS_Pack1() {//DTO
    }

    public TGS_Pack1(A value0) {
        this.value0 = value0;
    }
    public A value0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value0 + "]";
    }

    public boolean isEmpty() {
        return value0 == null;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    public static <A> TGS_Pack1<A> of(A value0) {
        return new TGS_Pack1(value0);
    }
}
