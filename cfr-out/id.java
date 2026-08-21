/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.slf4j.Logger
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.slf4j.Logger;

public class id {
    private static final Logger a = LogUtils.getLogger();
    private static final byte b = 1;
    private static final byte c = 2;

    public static int a(boolean $$0, boolean $$1) {
        int $$2 = 0;
        if ($$0) {
            $$2 |= 1;
        }
        if ($$1) {
            $$2 |= 2;
        }
        return $$2;
    }

    public static boolean a(byte $$0) {
        return ($$0 & 1) != 0;
    }

    public static boolean b(byte $$0) {
        return ($$0 & 2) != 0;
    }

    private static <A extends ArgumentType<?>, T extends ib.a<A>> void a(JsonObject $$0, ib<A, T> $$1, ib.a<A> $$2) {
        $$1.a($$2, $$0);
    }

    private static <T extends ArgumentType<?>> void a(JsonObject $$0, T $$1) {
        ib.a<T> $$2 = ic.b($$1);
        $$0.addProperty("type", "argument");
        $$0.addProperty("parser", String.valueOf(mi.v.b($$2.a())));
        JsonObject $$3 = new JsonObject();
        id.a($$3, $$2.a(), $$2);
        if (!$$3.isEmpty()) {
            $$0.add("properties", (JsonElement)$$3);
        }
    }

    public static <S> JsonObject a(CommandDispatcher<S> $$02, CommandNode<S> $$1) {
        Collection $$11;
        Object $$3;
        JsonObject $$2 = new JsonObject();
        CommandNode<S> commandNode = $$1;
        Objects.requireNonNull(commandNode);
        CommandNode<S> commandNode2 = commandNode;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{RootCommandNode.class, LiteralCommandNode.class, ArgumentCommandNode.class}, commandNode2, n2)) {
            case 0: {
                $$3 = (RootCommandNode)commandNode2;
                $$2.addProperty("type", "root");
                break;
            }
            case 1: {
                LiteralCommandNode $$4 = (LiteralCommandNode)commandNode2;
                $$2.addProperty("type", "literal");
                break;
            }
            case 2: {
                ArgumentCommandNode $$5 = (ArgumentCommandNode)commandNode2;
                id.a($$2, $$5.getType());
                break;
            }
            default: {
                a.error("Could not serialize node {} ({})!", $$1, $$1.getClass());
                $$2.addProperty("type", "unknown");
            }
        }
        Collection $$6 = $$1.getChildren();
        if (!$$6.isEmpty()) {
            JsonObject $$7 = new JsonObject();
            $$3 = $$6.iterator();
            while ($$3.hasNext()) {
                CommandNode $$8 = (CommandNode)$$3.next();
                $$7.add($$8.getName(), (JsonElement)id.a($$02, $$8));
            }
            $$2.add("children", (JsonElement)$$7);
        }
        if ($$1.getCommand() != null) {
            $$2.addProperty("executable", Boolean.valueOf(true));
        }
        if (($$3 = $$1.getRequirement()) instanceof bbm) {
            bbm $$9 = (bbm)$$3;
            JsonElement $$10 = (JsonElement)bbj.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$9.a()).getOrThrow($$0 -> new IllegalStateException("Failed to serialize requirement: " + $$0));
            $$2.add("permissions", $$10);
        }
        if ($$1.getRedirect() != null && !($$11 = $$02.getPath($$1.getRedirect())).isEmpty()) {
            JsonArray $$12 = new JsonArray();
            for (String $$13 : $$11) {
                $$12.add($$13);
            }
            $$2.add("redirect", (JsonElement)$$12);
        }
        return $$2;
    }

    public static <T> Set<ArgumentType<?>> a(CommandNode<T> $$0) {
        ReferenceOpenHashSet $$1 = new ReferenceOpenHashSet();
        HashSet $$2 = new HashSet();
        id.a($$0, $$2, $$1);
        return $$2;
    }

    private static <T> void a(CommandNode<T> $$0, Set<ArgumentType<?>> $$1, Set<CommandNode<T>> $$22) {
        if (!$$22.add($$0)) {
            return;
        }
        if ($$0 instanceof ArgumentCommandNode) {
            ArgumentCommandNode $$3 = (ArgumentCommandNode)$$0;
            $$1.add($$3.getType());
        }
        $$0.getChildren().forEach($$2 -> id.a($$2, $$1, $$22));
        CommandNode $$4 = $$0.getRedirect();
        if ($$4 != null) {
            id.a($$4, $$1, $$22);
        }
    }
}

