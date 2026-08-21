/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.context.ContextChain$Stage
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;

public class hm<T extends ef<T>> {
    @VisibleForTesting
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("command.forkLimit", $$0));
    private final String b;
    private final ContextChain<T> c;

    public hm(String $$0, ContextChain<T> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(T $$02, List<T> $$12, hg<T> $$22, hi $$3, hb $$4) {
        ContextChain $$5 = this.c;
        hb $$6 = $$4;
        List<Object> $$7 = $$12;
        if ($$5.getStage() != ContextChain.Stage.EXECUTE) {
            $$22.c().a(() -> "prepare " + this.b);
            try {
                int $$8 = $$22.d();
                while ($$5.getStage() != ContextChain.Stage.EXECUTE) {
                    RedirectModifier $$10;
                    CommandContext $$9 = $$5.getTopContext();
                    if ($$9.isForked()) {
                        $$6 = $$6.b();
                    }
                    if (($$10 = $$9.getRedirectModifier()) instanceof he) {
                        he $$11 = (he)$$10;
                        $$11.a($$02, $$7, $$5, $$6, hh.a($$22, $$3));
                        return;
                    }
                    if ($$10 != null) {
                        $$22.e();
                        boolean $$122 = $$6.a();
                        ObjectArrayList $$13 = new ObjectArrayList();
                        for (ef ef2 : $$7) {
                            Collection $$15;
                            block21: {
                                try {
                                    $$15 = ContextChain.runModifier((CommandContext)$$9, (Object)ef2, ($$0, $$1, $$2) -> {}, (boolean)$$122);
                                    if ($$13.size() + $$15.size() < $$8) break block21;
                                    $$02.a(a.create((Object)$$8), $$122, $$22.b());
                                    return;
                                }
                                catch (CommandSyntaxException $$16) {
                                    ef2.a($$16, $$122, $$22.b());
                                    if ($$122) continue;
                                    $$22.c().c();
                                    return;
                                }
                            }
                            $$13.addAll($$15);
                        }
                        $$7 = $$13;
                    }
                    $$5 = $$5.nextStage();
                }
            }
            finally {
                $$22.c().c();
            }
        }
        if ($$7.isEmpty()) {
            if ($$6.c()) {
                $$22.a(new hc($$3, hq.a()));
            }
            return;
        }
        CommandContext $$17 = $$5.getTopContext();
        Command $$18 = $$17.getCommand();
        if ($$18 instanceof hd) {
            hd $$19 = (hd)$$18;
            hh $$20 = hh.a($$22, $$3);
            for (ef ef3 : $$7) {
                $$19.a(ef3, $$5, $$6, $$20);
            }
        } else {
            if ($$6.c()) {
                ef $$222 = (ef)$$7.get(0);
                $$222 = $$222.b(ea.chain($$222.q(), $$3.d()));
                $$7 = List.of($$222);
            }
            hp $$23 = new hp(this.b, $$6, $$17);
            ho.a($$22, $$3, $$7, ($$1, $$2) -> new hc<ef>($$1, $$23.bind($$2)));
        }
    }

    protected void a(hg<T> $$0, hi $$1) {
        hj $$2 = $$0.b();
        if ($$2 != null) {
            $$2.a($$1.c(), this.b);
        }
    }

    public String toString() {
        return this.b;
    }

    public static class b<T extends ef<T>>
    extends hm<T>
    implements hf<T> {
        private final T b;

        public b(String $$0, ContextChain<T> $$1, T $$2) {
            super($$0, $$1);
            this.b = $$2;
        }

        @Override
        public void execute(hg<T> $$0, hi $$1) {
            this.a($$0, $$1);
            this.a(this.b, List.of(this.b), $$0, $$1, hb.a);
        }
    }

    public static class a<T extends ef<T>>
    extends hm<T>
    implements hf<T> {
        private final hb b;
        private final T c;
        private final List<T> d;

        public a(String $$0, ContextChain<T> $$1, hb $$2, T $$3, List<T> $$4) {
            super($$0, $$1);
            this.c = $$3;
            this.d = $$4;
            this.b = $$2;
        }

        @Override
        public void execute(hg<T> $$0, hi $$1) {
            this.a(this.c, this.d, $$0, $$1, this.b);
        }
    }

    public static class c<T extends ef<T>>
    extends hm<T>
    implements hk<T> {
        public c(String $$0, ContextChain<T> $$1) {
            super($$0, $$1);
        }

        public void a(T $$0, hg<T> $$1, hi $$2) {
            this.a($$1, $$2);
            this.a($$0, List.of($$0), $$1, $$2, hb.a);
        }

        @Override
        public /* synthetic */ void execute(Object object, hg hg2, hi hi2) {
            this.a((ef)object, hg2, hi2);
        }
    }
}

