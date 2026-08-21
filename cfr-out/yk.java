/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  javax.annotation.CheckReturnValue
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.CheckReturnValue;
import org.jspecify.annotations.Nullable;

public class yk {
    public static final String a = ", ";
    public static final yh b = yh.b(", ").a(l.h);
    public static final yh c = yh.b(", ");

    @CheckReturnValue
    public static yw a(yw $$0, zf $$1) {
        if ($$1.h()) {
            return $$0;
        }
        zf $$2 = $$0.a();
        if ($$2.h()) {
            return $$0.b($$1);
        }
        if ($$2.equals($$1)) {
            return $$0;
        }
        return $$0.b($$2.a($$1));
    }

    @CheckReturnValue
    public static yh a(yh $$0, zf $$1) {
        if ($$1.h()) {
            return $$0;
        }
        zf $$2 = $$0.a();
        if ($$2.h()) {
            return $$0.f().b($$1);
        }
        if ($$2.equals($$1)) {
            return $$0;
        }
        return $$0.f().b($$2.a($$1));
    }

    public static Optional<yw> a(@Nullable ed $$0, Optional<yh> $$1, @Nullable cgk $$2, int $$3) throws CommandSyntaxException {
        return $$1.isPresent() ? Optional.of(yk.a($$0, $$1.get(), $$2, $$3)) : Optional.empty();
    }

    public static yw a(@Nullable ed $$0, yh $$1, @Nullable cgk $$2, int $$3) throws CommandSyntaxException {
        if ($$3 > 100) {
            return $$1.f();
        }
        yw $$4 = $$1.b().a($$0, $$2, $$3 + 1);
        for (yh $$5 : $$1.c()) {
            $$4.b(yk.a($$0, $$5, $$2, $$3 + 1));
        }
        return $$4.c(yk.a($$0, $$1.a(), $$2, $$3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static zf a(@Nullable ed $$0, zf $$1, @Nullable cgk $$2, int $$3) throws CommandSyntaxException {
        yo $$4 = $$1.j();
        if (!($$4 instanceof yo.e)) return $$1;
        yo.e e2 = (yo.e)$$4;
        try {
            yh yh2;
            yh $$5 = yh2 = e2.b();
            yo.e $$6 = new yo.e(yk.a($$0, $$5, $$2, $$3 + 1));
            return $$1.a($$6);
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public static yh a(Collection<String> $$02) {
        return yk.a($$02, (T $$0) -> yh.b($$0).a(l.k));
    }

    public static <T extends Comparable<T>> yh a(Collection<T> $$0, Function<T, yh> $$1) {
        if ($$0.isEmpty()) {
            return yg.a;
        }
        if ($$0.size() == 1) {
            return $$1.apply((Comparable)$$0.iterator().next());
        }
        ArrayList $$2 = Lists.newArrayList($$0);
        $$2.sort(Comparable::compareTo);
        return yk.b($$2, $$1);
    }

    public static <T> yh b(Collection<? extends T> $$0, Function<T, yh> $$1) {
        return yk.a($$0, b, $$1);
    }

    public static <T> yw a(Collection<? extends T> $$0, Optional<? extends yh> $$1, Function<T, yh> $$2) {
        return yk.a($$0, (yh)DataFixUtils.orElse($$1, (Object)b), $$2);
    }

    public static yh a(Collection<? extends yh> $$0, yh $$1) {
        return yk.a($$0, $$1, Function.identity());
    }

    public static <T> yw a(Collection<? extends T> $$0, yh $$1, Function<T, yh> $$2) {
        if ($$0.isEmpty()) {
            return yh.i();
        }
        if ($$0.size() == 1) {
            return $$2.apply($$0.iterator().next()).f();
        }
        yw $$3 = yh.i();
        boolean $$4 = true;
        for (T $$5 : $$0) {
            if (!$$4) {
                $$3.b($$1);
            }
            $$3.b($$2.apply($$5));
            $$4 = false;
        }
        return $$3;
    }

    public static yw a(yh $$0) {
        return yh.a("chat.square_brackets", $$0);
    }

    public static yh a(Message $$0) {
        if ($$0 instanceof yh) {
            yh $$1 = (yh)$$0;
            return $$1;
        }
        return yh.b($$0.getString());
    }

    public static boolean b(@Nullable yh $$0) {
        yi yi2;
        if ($$0 != null && (yi2 = $$0.b()) instanceof zq) {
            zq $$1 = (zq)yi2;
            String $$2 = $$1.b();
            String $$3 = $$1.c();
            return $$3 != null || uu.a().b($$2);
        }
        return true;
    }

    public static yw a(String $$0) {
        return yk.a(yh.b($$0).a($$1 -> $$1.a(l.k).a(new yf.c($$0)).a(new yo.e(yh.c("chat.copy.click"))).a($$0)));
    }
}

