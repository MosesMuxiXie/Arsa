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

public class faq
implements fac {
    public static final Codec<faq> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.list(fak.a.a).fieldOf("targets").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, faq::new));
    public final List<fak.a> b;

    public faq(eoh $$0, eoh $$1) {
        this((List<fak.a>)ImmutableList.of((Object)fak.a(new fiu($$0), $$1)));
    }

    public faq(List<fak.a> $$0) {
        this.b = $$0;
    }
}

