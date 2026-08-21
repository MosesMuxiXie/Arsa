/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class baw
implements baz,
AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private bap c;
    private final List<bat> d = Lists.newArrayList();
    private final azn e;

    public baw(azn $$0) {
        this.e = $$0;
        this.c = new bas($$0, List.of());
    }

    @Override
    public void close() {
        this.c.close();
    }

    public void a(bat $$0) {
        this.d.add($$0);
    }

    public bav a(Executor $$0, Executor $$1, CompletableFuture<bhr> $$2, List<azl> $$3) {
        a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(azl::b).collect(Collectors.joining(", "))));
        this.c.close();
        this.c = new bas(this.e, $$3);
        return bbf.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
    }

    @Override
    public Optional<bax> getResource(amo $$0) {
        return this.c.getResource($$0);
    }

    @Override
    public Set<String> a() {
        return this.c.a();
    }

    @Override
    public List<bax> a(amo $$0) {
        return this.c.a($$0);
    }

    @Override
    public Map<amo, bax> b(String $$0, Predicate<amo> $$1) {
        return this.c.b($$0, $$1);
    }

    @Override
    public Map<amo, List<bax>> c(String $$0, Predicate<amo> $$1) {
        return this.c.c($$0, $$1);
    }

    @Override
    public Stream<azl> b() {
        return this.c.b();
    }
}

