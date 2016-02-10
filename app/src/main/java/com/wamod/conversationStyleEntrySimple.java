package com.wamod;

import android.graphics.Color;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.whatsapp.av5;

/**
 * Created by brianvalente on 10/4/15.
 */
public class conversationStyleEntrySimple {
    public static void init(com.whatsapp.Conversation a) {
        EditText entry = (EditText) a.findViewById(id.entry);
        ImageButton voiceNoteBtn = (ImageButton) a.findViewById(id.voice_note_btn);
        ImageButton sendBtn = (ImageButton) a.findViewById(id.send);

        FrameLayout footer = (FrameLayout) a.findViewById(id.conversationentrywamod_footer);

        footer.setBackgroundColor(Color.parseColor("#" + utils.prefs.getString("theme_simple_conversation_bgcolor", "ffffff")));

        entry.setTextSize(TypedValue.COMPLEX_UNIT_DIP, utils.prefs.getFloat("theme_simple_conversation_entry_textsize", 20));
        entry.setHintTextColor(Color.parseColor("#" + utils.prefs.getString("theme_simple_conversation_entry_hintcolor", "606060")));
        entry.setTextColor(Color.parseColor("#" + utils.prefs.getString("theme_simple_conversation_entry_textcolor", "2a2a2a")));
        entry.clearFocus();

        voiceNoteBtn.setColorFilter(Color.parseColor("#" + utils.prefs.getString("theme_simple_conversation_mic_color", "606060")));
        sendBtn.setColorFilter(Color.parseColor("#" + utils.prefs.getString("theme_simple_conversation_send_color", "606060")));
    }
}
