/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface evx
extends BiPredicate<dxn, is> {
    public static final Codec<evx> b = mi.M.q().dispatch(evx::a, evy::codec);
    public static final evx c = evx.a(dzs.a);
    public static final evx d = evx.a(dzs.a, dzs.J);

    public evy<?> a();

    public static evx a(List<evx> $$0) {
        return new evv($$0);
    }

    public static evx a(evx ... $$0) {
        return evx.a(List.of($$0));
    }

    public static evx a(evx $$0, evx $$1) {
        return evx.a(List.of($$0, $$1));
    }

    public static evx b(List<evx> $$0) {
        return new evw($$0);
    }

    public static evx b(evx ... $$0) {
        return evx.b(List.of($$0));
    }

    public static evx b(evx $$0, evx $$1) {
        return evx.b(List.of($$0, $$1));
    }

    public static evx a(jy $$0, List<dzq> $$1) {
        return new ewd($$0, jh.a(dzq::p, $$1));
    }

    public static evx c(List<dzq> $$0) {
        return evx.a(jy.i, $$0);
    }

    public static evx a(jy $$0, dzq ... $$1) {
        return evx.a($$0, List.of($$1));
    }

    public static evx a(dzq ... $$0) {
        return evx.a(jy.i, $$0);
    }

    public static evx a(jy $$0, bef<dzq> $$1) {
        return new ewc($$0, $$1);
    }

    public static evx a(bef<dzq> $$0) {
        return evx.a(jy.i, $$0);
    }

    public static evx b(jy $$0, List<fla> $$1) {
        return new ewe($$0, jh.a(fla::k, $$1));
    }

    public static evx a(jy $$0, fla ... $$1) {
        return evx.b($$0, List.of($$1));
    }

    public static evx a(fla ... $$0) {
        return evx.a(jy.i, $$0);
    }

    public static evx a(evx $$0) {
        return new ewf($$0);
    }

    public static evx a(jy $$0) {
        return new ewg($$0);
    }

    public static evx b() {
        return evx.a(jy.i);
    }

    public static evx a(eoh $$0, jy $$1) {
        return new ewl($$1, $$0);
    }

    public static evx a(jy $$0, iz $$1) {
        return new ewa($$0, $$1);
    }

    public static evx a(iz $$0) {
        return evx.a(jy.i, $$0);
    }

    public static evx b(jy $$0) {
        return new ewh($$0);
    }

    public static evx c() {
        return evx.b(jy.i);
    }

    public static evx d() {
        return evx.c(jy.i);
    }

    public static evx c(jy $$0) {
        return evx.a($$0, flc.a);
    }

    public static evx d(jy $$0) {
        return new ewb($$0);
    }

    public static evx e() {
        return ewj.a;
    }

    public static evx e(jy $$0) {
        return new ewk($$0);
    }

    public static evx f() {
        return evx.e(jy.i);
    }
}

