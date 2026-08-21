/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class js {
    public static <E> Codec<jh<E>> a(amt<? extends jq<E>> $$0, Codec<E> $$1) {
        return js.a($$0, $$1, false);
    }

    public static <E> Codec<jh<E>> a(amt<? extends jq<E>> $$0, Codec<E> $$1, boolean $$2) {
        return amn.a($$0, amq.a($$0, $$1), $$2);
    }

    public static <E> Codec<jh<E>> a(amt<? extends jq<E>> $$0) {
        return js.a($$0, false);
    }

    public static <E> Codec<jh<E>> a(amt<? extends jq<E>> $$0, boolean $$1) {
        return amn.a($$0, amr.a($$0), $$1);
    }
}

