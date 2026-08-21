/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bsd
extends bnw {
    public bsd(Schema $$02) {
        super($$02, "WrittenBookPagesStrictJsonFix", $$0 -> $$0.equals("minecraft:written_book"));
    }

    @Override
    protected Typed<?> a(Typed<?> $$0) {
        Type $$12 = this.getInputSchema().getType(bqh.D);
        Type $$2 = this.getInputSchema().getType(bqh.x);
        OpticFinder $$3 = $$2.findField("tag");
        OpticFinder $$4 = $$3.type().findField("pages");
        OpticFinder $$5 = DSL.typeFinder((Type)$$12);
        return $$0.updateTyped($$4, $$1 -> $$1.update($$5, $$0 -> $$0.mapSecond(bic::c)));
    }
}

