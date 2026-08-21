/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bay {
    private static final Codec<bay> b = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(bfy.a).fieldOf("block").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, bay::new));
    public static final azy<bay> a = new azy<bay>("filter", b);
    private final List<bfy> c;

    public bay(List<bfy> $$0) {
        this.c = List.copyOf($$0);
    }

    public boolean a(String $$0) {
        return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
    }

    public boolean b(String $$0) {
        return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
    }
}

