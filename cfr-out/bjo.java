/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class bjo
extends bif {
    private final String a;
    private final String b;
    private final String c;
    private final UnaryOperator<String> d;

    public bjo(Schema $$0, String $$1, String $$2, String $$3, String $$4, UnaryOperator<String> $$5) {
        super($$0, $$1);
        this.a = $$2;
        this.b = $$3;
        this.c = $$4;
        this.d = $$5;
    }

    @Override
    protected boolean a(String $$0) {
        return $$0.equals(this.a);
    }

    @Override
    protected <T> Dynamic<T> a(String $$02, Dynamic<T> $$1) {
        return $$1.renameAndFixField(this.b, this.c, $$0 -> $$0.createString((String)this.d.apply($$0.asString(""))));
    }
}

