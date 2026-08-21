/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.datafixers.util.Either;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public interface yh
extends Message,
yn {
    public zf a();

    public yi b();

    @Override
    default public String getString() {
        return yn.super.getString();
    }

    default public String a(int $$0) {
        StringBuilder $$1 = new StringBuilder();
        this.a((String $$2) -> {
            int $$3 = $$0 - $$1.length();
            if ($$3 <= 0) {
                return a;
            }
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
        });
        return $$1.toString();
    }

    public List<yh> c();

    default public @Nullable String d() {
        yi yi2 = this.b();
        if (yi2 instanceof zn) {
            zn $$0 = (zn)yi2;
            if (this.c().isEmpty() && this.a().h()) {
                return $$0.b();
            }
        }
        return null;
    }

    default public yw e() {
        return yw.a(this.b());
    }

    default public yw f() {
        return new yw(this.b(), new ArrayList<yh>(this.c()), this.a());
    }

    public bfr g();

    @Override
    default public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        zf $$2 = this.a().a($$1);
        Optional<T> $$3 = this.b().a($$0, $$2);
        if ($$3.isPresent()) {
            return $$3;
        }
        for (yh $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if (!$$5.isPresent()) continue;
            return $$5;
        }
        return Optional.empty();
    }

    @Override
    default public <T> Optional<T> a(yn.a<T> $$0) {
        Optional<T> $$1 = this.b().a($$0);
        if ($$1.isPresent()) {
            return $$1;
        }
        for (yh $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) continue;
            return $$3;
        }
        return Optional.empty();
    }

    default public List<yh> h() {
        return this.a(zf.a);
    }

    default public List<yh> a(zf $$0) {
        ArrayList $$12 = Lists.newArrayList();
        this.a(($$1, $$2) -> {
            if (!$$2.isEmpty()) {
                $$12.add(yh.b($$2).c($$1));
            }
            return Optional.empty();
        }, $$0);
        return $$12;
    }

    default public boolean a(yh $$0) {
        List<yh> $$2;
        if (this.equals($$0)) {
            return true;
        }
        List<yh> $$1 = this.h();
        return Collections.indexOfSubList($$1, $$2 = $$0.a(this.a())) != -1;
    }

    public static yh a(@Nullable String $$0) {
        return $$0 != null ? yh.b($$0) : yg.a;
    }

    public static yw b(String $$0) {
        return yw.a(zn.a($$0));
    }

    public static yw c(String $$0) {
        return yw.a(new zq($$0, null, zq.a));
    }

    public static yw a(String $$0, Object ... $$1) {
        return yw.a(new zq($$0, null, $$1));
    }

    public static yw b(String $$0, Object ... $$1) {
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            Object $$3 = $$1[$$2];
            if (zq.a($$3) || $$3 instanceof yh) continue;
            $$1[$$2] = String.valueOf($$3);
        }
        return yh.a($$0, $$1);
    }

    public static yw a(String $$0, @Nullable String $$1) {
        return yw.a(new zq($$0, $$1, zq.a));
    }

    public static yw a(String $$0, @Nullable String $$1, Object ... $$2) {
        return yw.a(new zq($$0, $$1, $$2));
    }

    public static yw i() {
        return yw.a(zn.b);
    }

    public static yw d(String $$0) {
        return yw.a(new zj($$0));
    }

    public static yw a(String $$0, boolean $$1, Optional<yh> $$2, zt $$3) {
        return yw.a(new zl($$0, $$1, $$2, $$3));
    }

    public static yw a(gx $$0, String $$1) {
        return yw.a(new zo((Either<gx, String>)Either.left((Object)$$0), $$1));
    }

    public static yw b(String $$0, String $$1) {
        return yw.a(new zo((Either<gx, String>)Either.right((Object)$$0), $$1));
    }

    public static yw a(gx $$0, Optional<yh> $$1) {
        return yw.a(new zp($$0, $$1));
    }

    public static yw a(zz $$0) {
        return yw.a(new zm($$0));
    }

    public static yh a(Date $$0) {
        return yh.b($$0.toString());
    }

    public static yh a(Message $$0) {
        yh yh2;
        if ($$0 instanceof yh) {
            yh $$1 = (yh)$$0;
            yh2 = $$1;
        } else {
            yh2 = yh.b($$0.getString());
        }
        return yh2;
    }

    public static yh a(UUID $$0) {
        return yh.b($$0.toString());
    }

    public static yh a(amo $$0) {
        return yh.b($$0.toString());
    }

    public static yh a(dvu $$0) {
        return yh.b($$0.toString());
    }

    public static yh a(URI $$0) {
        return yh.b($$0.toString());
    }
}

