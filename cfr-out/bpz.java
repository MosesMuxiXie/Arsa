/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class bpz
extends big {
    private final Function<String, String> a;

    public bpz(Schema $$0, String $$1, Function<String, String> $$2) {
        super($$0, $$1);
        this.a = $$2;
    }

    @Override
    protected <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$0) {
        return $$0.map($$02 -> $$02.update("type", $$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asString().map(this.a).map(arg_0 -> ((Dynamic)$$0).createString(arg_0)).result(), (Object)$$0)));
    }
}

