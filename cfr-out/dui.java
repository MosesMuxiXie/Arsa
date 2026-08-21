/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public record dui(int a, Map<duk, Integer> b, int c, jd<bcz> d, float e, float f, bef<dlp> g, amt<dul> h) {
    public don a(duk $$0) {
        int $$1 = this.b.getOrDefault($$0, 0);
        don.a $$2 = don.a();
        cgw $$3 = cgw.a($$0.a());
        amo $$4 = amo.b("armor." + $$0.b());
        $$2.a(cis.b, new ciq($$4, $$1, ciq.a.a), $$3);
        $$2.a(cis.c, new ciq($$4, this.e, ciq.a.a), $$3);
        if (this.f > 0.0f) {
            $$2.a(cis.r, new ciq($$4, this.f, ciq.a.a), $$3);
        }
        return $$2.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dui.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dui.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dui.class, "durability;defense;enchantmentValue;equipSound;toughness;knockbackResistance;repairIngredient;assetId", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }
}

