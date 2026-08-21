/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwc {
    public static final dwc a = new dwc((List<String>)ImmutableList.of((Object)"vanilla"), (List<String>)ImmutableList.of());
    public static final Codec<dwc> b = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.STRING.listOf().fieldOf("Enabled").forGetter($$0 -> $$0.c), (App)Codec.STRING.listOf().fieldOf("Disabled").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, dwc::new));
    private final List<String> c;
    private final List<String> d;

    public dwc(List<String> $$0, List<String> $$1) {
        this.c = ImmutableList.copyOf($$0);
        this.d = ImmutableList.copyOf($$1);
    }

    public List<String> a() {
        return this.c;
    }

    public List<String> b() {
        return this.d;
    }
}

