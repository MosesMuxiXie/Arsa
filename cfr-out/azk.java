/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 */
import com.mojang.brigadier.arguments.StringArgumentType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record azk(String a, yh b, bal c, Optional<bag> d) {
    public yh a(boolean $$0, yh $$1) {
        return yk.a(this.c.a(yh.b(this.a))).a($$2 -> $$2.a($$0 ? l.k : l.m).a(StringArgumentType.escapeIfRequired((String)this.a)).a(new yo.e(yh.i().b(this.b).f("\n").b($$1))));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{azk.class, "id;title;source;knownPackInfo", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{azk.class, "id;title;source;knownPackInfo", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{azk.class, "id;title;source;knownPackInfo", "a", "b", "c", "d"}, this, $$0);
    }
}

