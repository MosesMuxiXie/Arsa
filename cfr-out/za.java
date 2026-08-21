/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record za<S>(List<a<S>> a) {
    public static <S> boolean a(ParseResults<S> $$0) {
        return !za.b($$0).a().isEmpty();
    }

    public static <S> za<S> b(ParseResults<S> $$0) {
        CommandContextBuilder $$5;
        CommandContextBuilder $$2;
        String $$1 = $$0.getReader().getString();
        CommandContextBuilder $$3 = $$2 = $$0.getContext();
        List<a<S>> $$4 = za.a($$1, $$3);
        while (($$5 = $$3.getChild()) != null && $$5.getRootNode() != $$2.getRootNode()) {
            $$4.addAll(za.a($$1, $$5));
            $$3 = $$5;
        }
        return new za<S>($$4);
    }

    private static <S> List<a<S>> a(String $$0, CommandContextBuilder<S> $$1) {
        ArrayList<a<S>> $$2 = new ArrayList<a<S>>();
        for (ParsedCommandNode $$3 : $$1.getNodes()) {
            ParsedArgument $$5;
            ArgumentCommandNode $$4;
            CommandNode commandNode = $$3.getNode();
            if (!(commandNode instanceof ArgumentCommandNode) || !(($$4 = (ArgumentCommandNode)commandNode).getType() instanceof fm) || ($$5 = (ParsedArgument)$$1.getArguments().get($$4.getName())) == null) continue;
            String $$6 = $$5.getRange().get($$0);
            $$2.add(new a($$4, $$6));
        }
        return $$2;
    }

    public @Nullable a<S> a(String $$0) {
        for (a<S> $$1 : this.a) {
            if (!$$0.equals($$1.a())) continue;
            return $$1;
        }
        return null;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{za.class, "arguments", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{za.class, "arguments", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{za.class, "arguments", "a"}, this, $$0);
    }

    public record a<S>(ArgumentCommandNode<S, ?> a, String b) {
        private final ArgumentCommandNode<S, ?> a;
        private final String b;

        public String a() {
            return this.a.getName();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "node;value", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "node;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "node;value", "a", "b"}, this, $$0);
        }

        public ArgumentCommandNode<S, ?> b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }
    }
}

