/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ipr<T>
extends ips<T> {
    private final ipw<T> c;

    public ipr(Function<T, Stream<String>> $$0, Function<T, Stream<amo>> $$1, List<T> $$2) {
        super($$1, $$2);
        this.c = ipw.plainText($$2, $$0);
    }

    @Override
    protected List<T> a(String $$0) {
        return this.c.search($$0);
    }

    @Override
    protected List<T> a(String $$0, String $$1) {
        List $$2 = this.b.a($$0);
        List $$3 = this.b.b($$1);
        List<T> $$4 = this.c.search($$1);
        ipv $$5 = new ipv($$3.iterator(), $$4.iterator(), this.a);
        return ImmutableList.copyOf(new ipu($$2.iterator(), $$5, this.a));
    }
}

