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
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class dcj {
    public static final Codec<dcj> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bfm.q.fieldOf("ticks_since_last_warning").orElse((Object)0).forGetter($$0 -> $$0.g), (App)bfm.q.fieldOf("warning_level").orElse((Object)0).forGetter($$0 -> $$0.h), (App)bfm.q.fieldOf("cooldown_ticks").orElse((Object)0).forGetter($$0 -> $$0.i)).apply((Applicative)$$02, dcj::new));
    public static final int b = 4;
    private static final double c = 16.0;
    private static final int d = 48;
    private static final int e = 12000;
    private static final int f = 200;
    private int g;
    private int h;
    private int i;

    public dcj(int $$0, int $$1, int $$2) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
    }

    public dcj() {
        this(0, 0, 0);
    }

    public void a() {
        if (this.g >= 12000) {
            this.f();
            this.g = 0;
        } else {
            ++this.g;
        }
        if (this.i > 0) {
            --this.i;
        }
    }

    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public static OptionalInt a(axf $$02, is $$1, axg $$2) {
        if (dcj.a($$02, $$1)) {
            return OptionalInt.empty();
        }
        List<axg> $$3 = dcj.b($$02, $$1);
        if (!$$3.contains($$2)) {
            $$3.add($$2);
        }
        if ($$3.stream().anyMatch($$0 -> $$0.ab().map(dcj::d).orElse(false))) {
            return OptionalInt.empty();
        }
        Optional<dcj> $$4 = $$3.stream().flatMap($$0 -> $$0.ab().stream()).max(Comparator.comparingInt(dcj::c));
        if ($$4.isPresent()) {
            dcj $$5 = $$4.get();
            $$5.e();
            $$3.forEach($$12 -> $$12.ab().ifPresent($$1 -> $$1.a($$5)));
            return OptionalInt.of($$5.h);
        }
        return OptionalInt.empty();
    }

    private boolean d() {
        return this.i > 0;
    }

    private static boolean a(axf $$0, is $$1) {
        fth $$2 = fth.a(ftm.b($$1), 48.0, 48.0, 48.0);
        return !$$0.a(dch.class, $$2).isEmpty();
    }

    private static List<axg> b(axf $$0, is $$12) {
        ftm $$2 = ftm.b($$12);
        return $$0.a((? super axg $$1) -> !$$1.au() && $$1.dI().a((jn)$$2, 16.0) && $$1.cb());
    }

    private void e() {
        if (!this.d()) {
            this.g = 0;
            this.i = 200;
            this.a(this.c() + 1);
        }
    }

    private void f() {
        this.a(this.c() - 1);
    }

    public void a(int $$0) {
        this.h = bgj.a($$0, 0, 4);
    }

    public int c() {
        return this.h;
    }

    private void a(dcj $$0) {
        this.h = $$0.h;
        this.i = $$0.i;
        this.g = $$0.g;
    }
}

