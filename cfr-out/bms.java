/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bms
extends box {
    public bms(Schema $$0) {
        super($$0, false, "Remove filtered text from signs", bqh.w, "minecraft:sign");
    }

    @Override
    protected <T> Dynamic<T> a(Dynamic<T> $$0) {
        return $$0.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4");
    }
}

