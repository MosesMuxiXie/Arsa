/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import org.jspecify.annotations.Nullable;

public class adt
implements aay<adb> {
    public static final aao<wx, adt> a = aay.a(adt::a, adt::new);
    private static final byte b = 3;
    private static final byte c = 4;
    private static final byte d = 8;
    private static final byte e = 16;
    private static final byte f = 32;
    private static final byte g = 0;
    private static final byte h = 1;
    private static final byte i = 2;
    private final int j;
    private final List<b> k;

    public <S> adt(RootCommandNode<S> $$0, e<S> $$1) {
        Object2IntMap<CommandNode<S>> $$2 = adt.a($$0);
        this.k = adt.a($$2, $$1);
        this.j = $$2.getInt($$0);
    }

    private adt(wx $$0) {
        this.k = $$0.a(adt::b);
        this.j = $$0.l();
        adt.a(this.k);
    }

    @Override
    private void a(wx $$02) {
        $$02.a(this.k, (? super wx $$0, T $$1) -> $$1.a((wx)((Object)$$0)));
        $$02.c(this.j);
    }

    private static void a(List<b> $$0, BiPredicate<b, IntSet> $$1) {
        IntOpenHashSet $$2 = new IntOpenHashSet((IntCollection)IntSets.fromTo((int)0, (int)$$0.size()));
        while (!$$2.isEmpty()) {
            boolean $$3 = $$2.removeIf(arg_0 -> adt.a($$1, $$0, (IntSet)$$2, arg_0));
            if ($$3) continue;
            throw new IllegalStateException("Server sent an impossible command tree");
        }
    }

    private static void a(List<b> $$0) {
        adt.a($$0, b::a);
        adt.a($$0, b::b);
    }

    private static <S> Object2IntMap<CommandNode<S>> a(RootCommandNode<S> $$0) {
        CommandNode $$3;
        Object2IntOpenHashMap $$1 = new Object2IntOpenHashMap();
        ArrayDeque<Object> $$2 = new ArrayDeque<Object>();
        $$2.add($$0);
        while (($$3 = (CommandNode)$$2.poll()) != null) {
            if ($$1.containsKey((Object)$$3)) continue;
            int $$4 = $$1.size();
            $$1.put((Object)$$3, $$4);
            $$2.addAll($$3.getChildren());
            if ($$3.getRedirect() == null) continue;
            $$2.add($$3.getRedirect());
        }
        return $$1;
    }

    private static <S> List<b> a(Object2IntMap<CommandNode<S>> $$0, e<S> $$1) {
        ObjectArrayList $$2 = new ObjectArrayList($$0.size());
        $$2.size($$0.size());
        for (Object2IntMap.Entry $$3 : Object2IntMaps.fastIterable($$0)) {
            $$2.set($$3.getIntValue(), (Object)adt.a((CommandNode)$$3.getKey(), $$1, $$0));
        }
        return $$2;
    }

    private static b b(wx $$0) {
        byte $$1 = $$0.readByte();
        int[] $$2 = $$0.c();
        int $$3 = ($$1 & 8) != 0 ? $$0.l() : 0;
        g $$4 = adt.a($$0, $$1);
        return new b($$4, $$1, $$3, $$2);
    }

    private static @Nullable g a(wx $$0, byte $$1) {
        int $$2 = $$1 & 3;
        if ($$2 == 2) {
            String $$3 = $$0.p();
            int $$4 = $$0.l();
            ib $$5 = (ib)mi.v.a($$4);
            if ($$5 == null) {
                return null;
            }
            Object $$6 = $$5.b($$0);
            amo $$7 = ($$1 & 0x10) != 0 ? $$0.q() : null;
            return new a($$3, (ib.a<?>)$$6, $$7);
        }
        if ($$2 == 1) {
            String $$8 = $$0.p();
            return new c($$8);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static <S> b a(CommandNode<S> $$0, e<S> $$1, Object2IntMap<CommandNode<S>> $$2) {
        void $$13;
        int $$5;
        int $$3 = 0;
        if ($$0.getRedirect() != null) {
            $$3 |= 8;
            int $$4 = $$2.getInt((Object)$$0.getRedirect());
        } else {
            $$5 = 0;
        }
        if ($$1.a($$0)) {
            $$3 |= 4;
        }
        if ($$1.b($$0)) {
            $$3 |= 0x20;
        }
        CommandNode<S> commandNode = $$0;
        Objects.requireNonNull(commandNode);
        CommandNode<S> commandNode2 = commandNode;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{RootCommandNode.class, ArgumentCommandNode.class, LiteralCommandNode.class}, commandNode2, n2)) {
            case 0: {
                RootCommandNode $$6 = (RootCommandNode)commandNode2;
                $$3 |= 0;
                Object $$7 = null;
                break;
            }
            case 1: {
                ArgumentCommandNode $$8 = (ArgumentCommandNode)commandNode2;
                amo $$9 = $$1.a($$8);
                a $$10 = new a($$8.getName(), ic.b($$8.getType()), $$9);
                $$3 |= 2;
                if ($$9 != null) {
                    $$3 |= 0x10;
                }
                break;
            }
            case 2: {
                LiteralCommandNode $$11 = (LiteralCommandNode)commandNode2;
                c $$12 = new c($$11.getLiteral());
                $$3 |= 1;
                break;
            }
            default: {
                throw new UnsupportedOperationException("Unknown node type " + String.valueOf($$0));
            }
        }
        int[] $$14 = $$0.getChildren().stream().mapToInt(arg_0 -> $$2.getInt(arg_0)).toArray();
        return new b((g)$$13, $$3, $$5, $$14);
    }

    @Override
    public aba<adt> a() {
        return ahz.r;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public <S> RootCommandNode<S> a(dz $$0, d<S> $$1) {
        return (RootCommandNode)new f<S>($$0, $$1, this.k).a(this.j);
    }

    private static /* synthetic */ boolean a(BiPredicate $$0, List $$1, IntSet $$2, int $$3) {
        return $$0.test((b)$$1.get($$3), $$2);
    }

    public static interface e<S> {
        public @Nullable amo a(ArgumentCommandNode<S, ?> var1);

        public boolean a(CommandNode<S> var1);

        public boolean b(CommandNode<S> var1);
    }

    static final class b
    extends Record {
        final @Nullable g a;
        final int b;
        final int c;
        final int[] d;

        b(@Nullable g $$0, int $$1, int $$2, int[] $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        public void a(wx $$0) {
            $$0.l(this.b);
            $$0.a(this.d);
            if ((this.b & 8) != 0) {
                $$0.c(this.c);
            }
            if (this.a != null) {
                this.a.a($$0);
            }
        }

        public boolean a(IntSet $$0) {
            if ((this.b & 8) != 0) {
                return !$$0.contains(this.c);
            }
            return true;
        }

        public boolean b(IntSet $$0) {
            for (int $$1 : this.d) {
                if (!$$0.contains($$1)) continue;
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "stub;flags;redirect;children", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "stub;flags;redirect;children", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "stub;flags;redirect;children", "a", "b", "c", "d"}, this, $$0);
        }

        public @Nullable g a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int[] d() {
            return this.d;
        }
    }

    static interface g {
        public <S> ArgumentBuilder<S, ?> a(dz var1, d<S> var2);

        public void a(wx var1);
    }

    record a(String a, ib.a<?> b, @Nullable amo c) implements g
    {
        @Override
        public <S> ArgumentBuilder<S, ?> a(dz $$0, d<S> $$1) {
            Object $$2 = this.b.b($$0);
            return $$1.a(this.a, (ArgumentType<?>)$$2, this.c);
        }

        @Override
        public void a(wx $$0) {
            $$0.a(this.a);
            adt$a.a($$0, this.b);
            if (this.c != null) {
                $$0.a(this.c);
            }
        }

        private static <A extends ArgumentType<?>> void a(wx $$0, ib.a<A> $$1) {
            adt$a.a($$0, $$1.a(), $$1);
        }

        private static <A extends ArgumentType<?>, T extends ib.a<A>> void a(wx $$0, ib<A, T> $$1, ib.a<A> $$2) {
            $$0.c(mi.v.a($$1));
            $$1.a($$2, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;argumentType;suggestionId", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;argumentType;suggestionId", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;argumentType;suggestionId", "a", "b", "c"}, this, $$0);
        }
    }

    record c(String a) implements g
    {
        @Override
        public <S> ArgumentBuilder<S, ?> a(dz $$0, d<S> $$1) {
            return $$1.a(this.a);
        }

        @Override
        public void a(wx $$0) {
            $$0.a(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id", "a"}, this, $$0);
        }
    }

    static class f<S> {
        private final dz a;
        private final d<S> b;
        private final List<b> c;
        private final List<CommandNode<S>> d;

        f(dz $$0, d<S> $$1, List<b> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            ObjectArrayList $$3 = new ObjectArrayList();
            $$3.size($$2.size());
            this.d = $$3;
        }

        public CommandNode<S> a(int $$0) {
            CommandNode $$7;
            CommandNode<S> $$1 = this.d.get($$0);
            if ($$1 != null) {
                return $$1;
            }
            b $$2 = this.c.get($$0);
            if ($$2.a == null) {
                RootCommandNode $$3 = new RootCommandNode();
            } else {
                ArgumentBuilder<S, ?> $$4 = $$2.a.a(this.a, this.b);
                if (($$2.b & 8) != 0) {
                    $$4.redirect(this.a($$2.c));
                }
                boolean $$5 = ($$2.b & 4) != 0;
                boolean $$6 = ($$2.b & 0x20) != 0;
                $$7 = this.b.a($$4, $$5, $$6).build();
            }
            this.d.set($$0, $$7);
            for (int $$8 : $$2.d) {
                CommandNode<S> $$9 = this.a($$8);
                if ($$9 instanceof RootCommandNode) continue;
                $$7.addChild($$9);
            }
            return $$7;
        }
    }

    public static interface d<S> {
        public ArgumentBuilder<S, ?> a(String var1);

        public ArgumentBuilder<S, ?> a(String var1, ArgumentType<?> var2, @Nullable amo var3);

        public ArgumentBuilder<S, ?> a(ArgumentBuilder<S, ?> var1, boolean var2, boolean var3);
    }
}

