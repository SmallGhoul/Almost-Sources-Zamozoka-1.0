package net.optifine.features.module.render;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.GeneralSettings.ColorMode;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import net.minecraft.class_4184;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.combat.Killaura;
import net.optifine.features.module.ghost.Reach;
import net.optifine.features.module.world.BlockReach;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class ReachDistances extends Module implements RenderListener, PacketOutputListener {
   // $FF: synthetic field
   NumberSetting Linda;
   // $FF: synthetic field
   double Margaret;
   // $FF: synthetic field
   EnumSetting<ColorMode> Thomas;
   // $FF: synthetic field
   BooleanSetting William;
   // $FF: synthetic field
   public static final ColorMode[] Jack = ColorMode.values();
   // $FF: synthetic field
   class_1297 Sarah;
   // $FF: synthetic field
   BooleanSetting Jacob = new BooleanSetting("Draw Combat Reach", true);
   // $FF: synthetic field
   public static final CircleMode[] Harry = CircleMode.values();
   // $FF: synthetic field
   ColorPickerSetting George;
   // $FF: synthetic field
   double Barbara;
   // $FF: synthetic field
   double Susan;
   // $FF: synthetic field
   BooleanSetting James;
   // $FF: synthetic field
   EnumSetting<ColorMode> Jennifer;
   // $FF: synthetic field
   NumberSetting Oscar;
   // $FF: synthetic field
   EnumSetting< CircleMode> Charlie;
   // $FF: synthetic field
   double Jessica;
   // $FF: synthetic field
   long OlIver;
   // $FF: synthetic field
   ColorPickerSetting Elizabeth;
   // $FF: synthetic field
   BooleanSetting Mary;
   // $FF: synthetic field
   EnumSetting< CircleMode> Patricia;

   private static int llllllllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   private static int lllllllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public ReachDistances() {
      super("ReachDistances", "Shows your reach distances as circles", Category.Harry);
      this.Charlie = new EnumSetting("Combat Circle Mode", Harry, CircleMode.Oliver);
      this.Thomas = new EnumSetting("Combat Circle Color Mode", Jack, ColorMode.THEME);
      this.George = new ColorPickerSetting("Combat Circle Color", 0.0F, 0.0F, 100.0F);
      this.Oscar = new NumberSetting("Combat Circle Opacity", 0.5D, 0.0D, 1.0D, 0.009999999776482582D);
      this.James = new BooleanSetting("Stick On Last Target", true);
      this.William = new BooleanSetting("Stick Only On Aura", true);
      this.Mary = new BooleanSetting("Draw Build Reach", true);
      this.Patricia = new EnumSetting("Build Circle Mode", Harry, CircleMode.Jack);
      this.Jennifer = new EnumSetting("Build Circle Color Mode", Jack, ColorMode.THEME);
      this.Elizabeth = new ColorPickerSetting("Build Circle Color", 0.0F, 0.0F, 100.0F);
      this.Linda = new NumberSetting("Build Circle Opacity", 0.25D, 0.0D, 1.0D, 0.009999999776482582D);
      this.Barbara = 0.0D;
      this.Susan = 0.0D;
      this.Margaret = 3.0D;
      this.Jessica = 4.5D;
      this.Sarah = null;
      this.OlIver = -69L;
      this.addSetting(new Splitter("Combat Circle"));
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(new Splitter("Build Circle"));
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      "".length();
      if (" ".length() <= 0) {
         throw null;
      }
   }

   private void Oliver(float partialTicks, EnumSetting<ColorMode> colorModeCombat, ColorPickerSetting combatColor, NumberSetting ccOpacity, BooleanSetting drawCombatReach, double currentRadReach, double currentYSmall, EnumSetting< CircleMode> circleModeCombat) {
      Color var10000;
      if (colorModeCombat.Harry() == ColorMode.THEME) {
         var10000 = ThemeManager.getPrimaryColor();
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      } else {
         var10000 = combatColor.Oscar();
      }

      Color combat = var10000;
      combat = new Color(combat.getRed(), combat.getGreen(), combat.getBlue(), (int)(255.0F * ccOpacity.George()));
      if (mc.field_1724 != null) {
         this.Oliver(mc.field_1724, partialTicks, currentRadReach, combat, currentYSmall, CircleMode.Oliver(( CircleMode)circleModeCombat.Harry()));
      }

      "".length();
      if (-" ".length() == -" ".length()) {
         ;
      }
   }

   private static int llllllllIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public void Oliver(float partialTicks) {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() > (34 ^ 28 ^ 190 ^ 132)) {
            return;
         }
      } else {
         if (llllllllII(this.Barbara, 0.0D) == 0) {
            this.Barbara = mc.field_1724.method_19538().field_1351;
         }

         if (llllllllII(this.Susan, 0.0D) == 0) {
            this.Susan = mc.field_1724.method_19538().field_1351;
         }

         Killaura killaura = Global.Jack().JacoB;
         BlockReach blockReach = Global.Jack().O;
         Reach reach = Global.Jack().MargareT;
         boolean auraEnabled = killaura.isEnabled();
         double var10000;
         if (this.Sarah != null && llllllllIl(System.currentTimeMillis() - this.OlIver, 1500L) < 0 && this.James.Jack() && (!this.William.Jack() || auraEnabled)) {
            var10000 = mc.field_1724.method_19538().method_1022(this.Sarah.method_19538());
            "".length();
            if ((182 ^ 178) < 0) {
               return;
            }
         } else if (auraEnabled) {
            var10000 = killaura.Oscar();
            "".length();
            if ("   ".length() == "".length()) {
               return;
            }
         } else if (reach.isEnabled()) {
            var10000 = reach.Thomas();
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         } else {
            var10000 = 3.0D;
         }

         double expectedReach = var10000;
         if (blockReach.isEnabled()) {
            var10000 = blockReach.Thomas();
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else if (mc.field_1724.method_7337()) {
            var10000 = 5.0D;
            "".length();
            if ("".length() > "   ".length()) {
               return;
            }
         } else {
            var10000 = 4.5D;
         }

         double expectedBlockReach = var10000;
         this.Margaret = (double)((float)(this.Margaret + (expectedReach - this.Margaret) * Math.pow((double)mc.method_1534() / 10.0D, 0.5D)));
         this.Jessica = (double)((float)(this.Jessica + (expectedBlockReach - this.Jessica) * Math.pow((double)mc.method_1534() / 10.0D, 0.5D)));
         this.Barbara = (double)((float)(this.Barbara + (mc.field_1724.method_19538().field_1351 - 0.2D - this.Barbara) * Math.pow((double)mc.method_1534() / 250.0D, 0.5D)));
         this.Susan = (double)((float)(this.Susan + (mc.field_1724.method_19538().field_1351 - 0.5D - this.Susan) * Math.pow((double)mc.method_1534() / 1500.0D, 0.5D)));
         if (this.Jacob.Jack()) {
            this.Oliver(partialTicks, this.Thomas, this.George, this.Oscar, this.Jacob, this.Margaret, this.Susan, this.Charlie);
         }

         if (this.Mary.Jack()) {
            this.Oliver(partialTicks, this.Jennifer, this.Elizabeth, this.Linda, this.Mary, this.Jessica, this.Barbara, this.Patricia);
         }

         "".length();
         if ((40 + 144 - 153 + 168 ^ 191 + 109 - 266 + 161) == 0) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if ("".length() != (4 ^ 0)) {
         ;
      }
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2824) {
         this.Sarah = ((class_2824)event.Jacob()).method_12248(mc.field_1687);
         this.OlIver = System.currentTimeMillis();
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   static {
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   public void Oliver(class_1297 entity, float partialTicks, double rad, Color color, double yPos, float lines) {
      GL11.glPushMatrix();
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      class_243 camPos = RenderUtils.getCameraPos();
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      class_4184 cam = mc.field_1773.method_19418();
      GL11.glRotatef(cam.method_19329(), 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(cam.method_19330(), 0.0F, 1.0F, 0.0F);
      double interpY = entity.field_5971 + (entity.method_23318() - entity.field_6036) * (double)partialTicks;
      double x = cam.method_19326().method_10216() - (entity.field_6038 + (entity.method_23317() - entity.field_6014) * (double)partialTicks);
      double y = interpY - cam.method_19326().method_10214() + (interpY - yPos);
      double z = cam.method_19326().method_10215() - (entity.field_5989 + (entity.method_23321() - entity.field_5969) * (double)partialTicks);
      RenderUtils.setLineWidth(2.0F);
      GL11.glBegin(3);
      GL11.glColor4d((double)((float)color.getRed() / 255.0F), (double)((float)color.getGreen() / 255.0F), (double)((float)color.getBlue() / 255.0F), (double)((float)color.getAlpha() / 255.0F));
      float i = 0.0F;

      do {
         if (lllllllllI((double)i, MathUtils.TAU) >= 0) {
            GL11.glEnd();
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
            "".length();
            if (null != null) {
               return;
            }

            return;
         }

         double vecX = x + rad * Math.cos((double)i);
         double vecZ = z + rad * Math.sin((double)i);
         GL11.glVertex3d(vecX, y, vecZ);
         i = (float)((double)i + MathUtils.TAU / (double)lines);
         "".length();
      } while(-" ".length() <= "".length());

   }

   private static enum CircleMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      private float Jacob;
      // $FF: synthetic field
      Oliver("Circle", 132.0F),
      // $FF: synthetic field
      Jack("Hexagon", 6.0F);

      static {
         "".length();
         if ("   ".length() > " ".length()) {
            ;
         }
      }

      private CircleMode(String name, float lines) {
         this.Harry = name;
         this.Jacob = lines;
         "".length();
         if (-" ".length() != -" ".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "   ".length() != "   ".length() ? null : var1;
      }

      // $FF: synthetic method
      static float Oliver( CircleMode x0) {
         float var1 = x0.Jacob;
         "".length();
         return "".length() > 0 ? 0.0F : var1;
      }
   }
}
