/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.commons.lang3.tuple.Pair
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class ets {
    public static final Codec<ets> a = RecordCodecBuilder.create($$02 -> $$02.group((App)etr.a.lenientOptionalFieldOf("event").forGetter($$0 -> $$0.b.map(Pair::getLeft)), (App)Codec.LONG.fieldOf("tick").forGetter($$0 -> $$0.b.map(Pair::getRight).orElse(-1L))).apply((Applicative)$$02, ets::new));
    private Optional<Pair<etr, Long>> b;

    public ets(Optional<etr> $$0, long $$12) {
        this.b = $$0.map($$1 -> Pair.of((Object)$$1, (Object)$$12));
    }

    public ets() {
        this.b = Optional.empty();
    }

    public void a(etr $$0, long $$1) {
        if (this.b($$0, $$1)) {
            this.b = Optional.of(Pair.of((Object)$$0, (Object)$$1));
        }
    }

    private boolean b(etr $$0, long $$1) {
        if (this.b.isEmpty()) {
            return true;
        }
        Pair<etr, Long> $$2 = this.b.get();
        long $$3 = (Long)$$2.getRight();
        if ($$1 != $$3) {
            return false;
        }
        etr $$4 = (etr)$$2.getLeft();
        if ($$0.b() < $$4.b()) {
            return true;
        }
        if ($$0.b() > $$4.b()) {
            return false;
        }
        return ett.a_($$0.a()) > ett.a_($$4.a());
    }

    public Optional<etr> a(long $$0) {
        if (this.b.isEmpty()) {
            return Optional.empty();
        }
        if ((Long)this.b.get().getRight() < $$0) {
            return Optional.of((etr)this.b.get().getLeft());
        }
        return Optional.empty();
    }

    public void a() {
        this.b = Optional.empty();
    }
}

