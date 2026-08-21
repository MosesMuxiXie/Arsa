/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bmr
extends bnw {
    public bmr(Schema $$02) {
        super($$02, "Remove filtered text from books", $$0 -> $$0.equals("minecraft:writable_book") || $$0.equals("minecraft:written_book"));
    }

    @Override
    protected Typed<?> a(Typed<?> $$02) {
        return bhs.a($$02, $$02.getType(), $$0 -> $$0.remove("filtered_title").remove("filtered_pages"));
    }
}

