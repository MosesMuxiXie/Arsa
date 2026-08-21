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
import java.util.function.Function;
import org.slf4j.Logger;

public class arq
implements arr {
    private static final Logger b = LogUtils.getLogger();
    static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.data.block.invalid"));
    public static final Function<String, ars.c> a = $$0 -> new ars.c((String)$$0){
        final /* synthetic */ String a;
        {
            this.a = string;
        }

        @Override
        public arr a(CommandContext<ed> $$0) throws CommandSyntaxException {
            is $$1 = gc.a($$0, this.a + "Pos");
            elb $$2 = ((ed)$$0.getSource()).f().c_($$1);
            if ($$2 == null) {
                throw c.create();
            }
            return new arq($$2, $$1);
        }

        @Override
        public ArgumentBuilder<ed, ?> a(ArgumentBuilder<ed, ?> $$0, Function<ArgumentBuilder<ed, ?>, ArgumentBuilder<ed, ?>> $$1) {
            return $$0.then(ee.b("block").then($$1.apply((ArgumentBuilder<ed, ?>)ee.a(this.a + "Pos", gc.a()))));
        }
    };
    private final elb d;
    private final is e;

    public arq(elb $$0, is $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public void a(uz $$0) {
        eoh $$1 = this.d.j().a_(this.e);
        try (bgp.j $$2 = new bgp.j(this.d.v(), b);){
            this.d.b(fno.a((bgp)$$2, (jf.a)this.d.j().J_(), $$0));
            this.d.e();
            this.d.j().a(this.e, $$1, $$1, 3);
        }
    }

    @Override
    public uz a() {
        return this.d.b(this.d.j().J_());
    }

    @Override
    public yh b() {
        return yh.a("commands.data.block.modified", this.e.u(), this.e.v(), this.e.w());
    }

    @Override
    public yh a(vz $$0) {
        return yh.a("commands.data.block.query", this.e.u(), this.e.v(), this.e.w(), vo.b($$0));
    }

    @Override
    public yh a(ex.g $$0, double $$1, int $$2) {
        return yh.a("commands.data.block.get", new Object[]{$$0.a(), this.e.u(), this.e.v(), this.e.w(), String.format(Locale.ROOT, "%.2f", $$1), $$2});
    }
}

