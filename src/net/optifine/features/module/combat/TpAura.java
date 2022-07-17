package net.optifine.features.module.combat;

import net.optifine.Global;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.util.GeneralSettings.Priority;
import net.minecraft.*;
import net.minecraft.class_2828.class_2829;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class TpAura extends Module implements PreMotionListener {
   // $FF: synthetic field
   public class_1297 Jack;
   // $FF: synthetic field
   private final NumberSetting Harry = new NumberSetting("Range", 20.0D, 6.0D, 100.0D, 1.0D);

   public void George() {
      class_746 player = mc.field_1724;
      double rangeSq = Math.pow(this.Harry.Jack(), 2.0D);
      Stream<class_1297> stream = StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
         byte var10000;
         if (!e.field_5988) {
            var10000 = 1;
            "".length();
            if (null != null) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)("  ".length() < 0 ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if (e instanceof class_1309 && lIlIllI(((class_1309)e).method_6032(), 0.0F) > 0) {
            var10000 = 1;
            "".length();
            if (-"  ".length() >= 0) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)("".length() != 0 ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if (lIlIlIl(player.method_5858(e), rangeSq) <= 0) {
            var10000 = 1;
            "".length();
            if ((23 ^ 18) == 0) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var4 = var10000;
         "".length();
         return (boolean)(-"  ".length() > 0 ? "".length() : var4);
      }).filter((e) -> {
         byte var10000;
         if (e != player) {
            var10000 = 1;
            "".length();
            if ("   ".length() < "  ".length()) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var2 = var10000;
         "".length();
         return (boolean)(null != null ? "".length() : var2);
      }).filter((e) -> {
         byte var1 = e instanceof class_745;
         "".length();
         return (boolean)("".length() > "".length() ? "".length() : var1);
      }).filter((e) -> {
         byte var10000;
         if (!Global.Oscar().contains(e.method_5820())) {
            var10000 = 1;
            "".length();
            if ("  ".length() == -" ".length()) {
               return (boolean)"".length();
            }
         } else {
            var10000 = 0;
         }

         byte var1 = var10000;
         "".length();
         return (boolean)(-"  ".length() >= 0 ? "".length() : var1);
      });
      class_1297 entity = (class_1297)stream.min(Priority.DISTANCE.comparator).orElse((Object)null);
      if (entity == null) {
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         this.Jack = entity;
         if (lIlIIll(player.method_7261(0.0F), 1.0F) < 0) {
            "".length();
            if ("".length() == " ".length()) {
               return;
            }
         } else {
            int i = 1;

            while(lIlIlII((double)i, Math.max(Math.abs(entity.method_23317() - player.method_23317()), Math.abs(entity.method_23321() - player.method_23321())) / 5.5D + 2.0D) <= 0) {
               player.field_3944.method_2883(new class_2829(player.method_23317() + (entity.method_23317() - player.method_23317()) / 5.5D * (double)i, player.method_23318() + (entity.method_23318() - player.method_23318()) / 5.5D * (double)i, player.method_23321() + (entity.method_23321() - player.method_23321()) / 5.5D * (double)i, true));
               ++i;
               "".length();
               if ((49 + 98 - 121 + 108 ^ 118 + 120 - 220 + 112) > (124 ^ 28 ^ 110 ^ 10)) {
                  return;
               }
            }

            player.field_3944.method_2883(new class_2824(entity, player.method_5715()));
            player.method_6104(class_1268.field_5808);
            player.method_7350();
            i = (int)Math.max(Math.abs(entity.method_23317() - player.method_23317()), Math.abs(entity.method_23321() - player.method_23321())) / 9 + 2;

            while(i > 0) {
               player.field_3944.method_2883(new class_2829(player.method_23317() + (entity.method_23317() - player.method_23317()) / 9.0D * (double)i, player.method_23318() + (entity.method_23318() - player.method_23318()) / 9.0D * (double)i, player.method_23321() + (entity.method_23321() - player.method_23321()) / 9.0D * (double)i, true));
               --i;
               "".length();
               if (null != null) {
                  return;
               }
            }

            "".length();
            if ("   ".length() <= 0) {
               return;
            }
         }
      }

   }

   private static int lIlIIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public TpAura() {
      super("TP-Aura", "Like killaura but more insane.", Category.Oliver);
      this.addSetting(this.Harry);
      "".length();
      if ("".length() > 0) {
         throw null;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   private static int lIlIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      "".length();
      if ("  ".length() >= 0) {
         ;
      }
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private static int lIlIllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
