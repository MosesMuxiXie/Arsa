/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.mojang.blocklist.BlockListSupplier
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.mojang.blocklist.BlockListSupplier;
import java.util.Objects;
import java.util.ServiceLoader;

public interface hju {
    public boolean a(hjv var1);

    public boolean a(hjw var1);

    public static hju a() {
        final ImmutableList $$0 = (ImmutableList)Streams.stream(ServiceLoader.load(BlockListSupplier.class)).map(BlockListSupplier::createBlockList).filter(Objects::nonNull).collect(ImmutableList.toImmutableList());
        return new hju(){

            @Override
            public boolean a(hjv $$02) {
                String $$1 = $$02.a();
                String $$22 = $$02.b();
                return $$0.stream().noneMatch($$2 -> $$2.test($$1) || $$2.test($$22));
            }

            @Override
            public boolean a(hjw $$02) {
                String $$12 = $$02.a();
                return $$0.stream().noneMatch($$1 -> $$1.test($$12));
            }
        };
    }
}

