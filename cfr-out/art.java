/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import org.slf4j.Logger;

public class art
implements arr {
    private static final Logger b = LogUtils.getLogger();
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.data.entity.invalid"));
    public static final Function<String, ars.c> a = $$0 -> new ars.c((String)$$0){
        final /* synthetic */ String a;
        {
            this.a = string;
        }

        @Override
        public arr a(CommandContext<ed> $$0) throws CommandSyntaxException {
            return new art(eq.a($$0, this.a));
        }

        @Override
        public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.b("entity").then($$1.apply((ArgumentBuilder<ed, ?>)ee.a(this.a, eq.a()))));
        }
    };
    private final cgk d;

    public art(cgk $$0) {
        this.d = $$0;
    }

    @Override
    public void a(uz $$0) throws CommandSyntaxException {
        if (this.d instanceof ddm) {
            throw c.create();
        }
        UUID $$1 = this.d.cY();
        try (bgp.j $$2 = new bgp.j(this.d.es(), b);){
            this.d.d(fno.a((bgp)$$2, (jf.a)this.d.eo(), $$0));
            this.d.a($$1);
        }
    }

    @Override
    public uz a() {
        return ct.b(this.d);
    }

    @Override
    public yh b() {
        return yh.a("commands.data.entity.modified", this.d.R_());
    }

    @Override
    public yh a(vz $$0) {
        return yh.a("commands.data.entity.query", this.d.R_(), vo.b($$0));
    }

    @Override
    public yh a(ex.g $$0, double $$1, int $$2) {
        return yh.a("commands.data.entity.get", new Object[]{$$0.a(), this.d.R_(), String.format(Locale.ROOT, "%.2f", $$1), $$2});
    }
}

