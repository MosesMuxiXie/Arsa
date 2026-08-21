/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gq {
    private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("arguments.item.overstacked", $$0, $$1));
    private final jd<dlp> b;
    private final kg c;

    public gq(jd<dlp> $$0, kg $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public dlp a() {
        return this.b.a();
    }

    public dlt a(int $$0, boolean $$1) throws CommandSyntaxException {
        dlt $$2 = new dlt(this.b, $$0);
        $$2.b(this.c);
        if ($$1 && $$0 > $$2.k()) {
            throw a.create((Object)this.b(), (Object)$$2.k());
        }
        return $$2;
    }

    public String a(jf.a $$0) {
        StringBuilder $$1 = new StringBuilder(this.b());
        String $$2 = this.b($$0);
        if (!$$2.isEmpty()) {
            $$1.append('[');
            $$1.append($$2);
            $$1.append(']');
        }
        return $$1.toString();
    }

    private String b(jf.a $$0) {
        ams<vz> $$1 = $$0.a(vn.a);
        return this.c.b().stream().flatMap($$12 -> {
            kh $$2 = (kh)$$12.getKey();
            amo $$3 = mi.am.b($$2);
            if ($$3 == null) {
                return Stream.empty();
            }
            Optional $$4 = (Optional)$$12.getValue();
            if ($$4.isPresent()) {
                kk $$5 = kk.a($$2, $$4.get());
                return $$5.a($$1).result().stream().map($$1 -> $$3.toString() + "=" + String.valueOf($$1));
            }
            return Stream.of("!" + $$3.toString());
        }).collect(Collectors.joining(String.valueOf(',')));
    }

    private String b() {
        return this.b.e().map(amt::a).orElseGet(() -> "unknown[" + String.valueOf(this.b) + "]").toString();
    }
}

