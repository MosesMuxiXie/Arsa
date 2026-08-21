/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class aru
implements arr {
    static final SuggestionProvider<ed> b = ($$0, $$1) -> ei.a(aru.a((CommandContext<ed>)$$0).a(), $$1);
    public static final Function<String, ars.c> a = $$0 -> new ars.c((String)$$0){
        final /* synthetic */ String a;
        {
            this.a = string;
        }

        @Override
        public arr a(CommandContext<ed> $$0) {
            return new aru(aru.a($$0), ev.a($$0, this.a));
        }

        @Override
        public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.b("storage").then($$1.apply((ArgumentBuilder<ed, ?>)ee.a(this.a, ev.a()).suggests(b))));
        }
    };
    private final fmz c;
    private final amo d;

    static fmz a(CommandContext<ed> $$0) {
        return ((ed)$$0.getSource()).m().aL();
    }

    aru(fmz $$0, amo $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(uz $$0) {
        this.c.a(this.d, $$0);
    }

    @Override
    public uz a() {
        return this.c.a(this.d);
    }

    @Override
    public yh b() {
        return yh.a("commands.data.storage.modified", yh.a(this.d));
    }

    @Override
    public yh a(vz $$0) {
        return yh.a("commands.data.storage.query", yh.a(this.d), vo.b($$0));
    }

    @Override
    public yh a(ex.g $$0, double $$1, int $$2) {
        return yh.a("commands.data.storage.get", new Object[]{$$0.a(), yh.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2});
    }
}

