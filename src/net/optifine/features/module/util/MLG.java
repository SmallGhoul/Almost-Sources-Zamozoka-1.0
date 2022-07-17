package net.optifine.features.module.util;

import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.audio.Sound;
import net.optifine.util.audio.SoundManager;
import net.optifine.util.render.Texture;
import net.minecraft.class_2698;
import net.minecraft.class_2767;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

public class MLG extends Module implements UpdateListener, Render2DListener, PacketInputListener {
   // $FF: synthetic field
   NumberSetting Harry;
   // $FF: synthetic field
   int Jacob;
   // $FF: synthetic field
   static Texture[] Jack = new Texture[10];

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2767) {
         class_2767 packet = (class_2767)event.Jacob();
         if (Integer.valueOf(-1301504686).equals(packet.method_11894().method_14833().method_12832().hashCode())) {
            SoundManager.play(Sound.MOM_GET_THE_CAMERA, this.Harry.Jack());
            "".length();
            if ((192 ^ 196) > (171 ^ 175)) {
               return;
            }
         } else if (Integer.valueOf(-481452514).equals(packet.method_11894().method_14833().method_12832().hashCode())) {
            SoundManager.play(Sound.RIFLE, this.Harry.Jack());
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      } else if (event.Jacob() instanceof class_2698) {
         class_2698 packet = (class_2698)event.Jacob();
         if (packet.field_12349 == mc.field_1724.method_5628()) {
            SoundManager.play(Sound.SAD_VIOLIN, this.Harry.Jack());
         }
      }

      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public MLG() {
      super("MLG", "become the xXx_$WAGNOSCOPER420_xXx");
      this.Harry = new NumberSetting("Volume", 0.5D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      this.Jacob = 0;
      this.Oliver(Category.Charlie);
      this.addSetting(this.Harry);
      "".length();
      if (-"  ".length() >= 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   static {
      int i = 0;

      do {
         if (i >= 10) {
            "".length();
            if (null != null) {
               return;
            }

            return;
         }

         Jack[i] = new Texture(String.valueOf((new StringBuilder()).append("/assets/zamorozka/images/mlg-frog/").append(i).append(".png")));
         ++i;
         "".length();
      } while(-" ".length() <= 0);

   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      int width = mc.method_22683().method_4486();
      int height = mc.method_22683().method_4502();
      int size = width / 7;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      Jack[this.Jacob % 10].render((double)(width - size), (double)(height - size), (double)width, (double)height);
      Jack[this.Jacob % 10].render((double)size, (double)(height - size), 0.0D, (double)height);
      "".length();
      if ((19 + 75 - 30 + 67 ^ 18 + 54 - 35 + 98) > 0) {
         ;
      }
   }

   public void Thomas() {
      if (!SoundManager.radioEnabled) {
         SoundManager.play(Sound.MEME_CIRCUS, this.Harry.Jack());
         "".length();
         if ((195 ^ 164 ^ 10 ^ 105) < "  ".length()) {
            return;
         }
      } else {
         SoundManager.stop(Sound.MEME_CIRCUS);
      }

      ++this.Jacob;
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      SoundManager.stop(Sound.MEME_CIRCUS);
      SoundManager.stop(Sound.MOM_GET_THE_CAMERA);
      SoundManager.stop(Sound.SAD_VIOLIN);
      "".length();
      if ("".length() >= 0) {
         ;
      }
   }
}
