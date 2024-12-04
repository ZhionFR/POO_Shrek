package Game;

import org.w3c.dom.ls.LSOutput;

public class Text
{
    int nb;

    // This will reunite all the texts, only need to use a number.

    public void displayText(int nb)
    {
        switch(nb)
        {
            case 1:
                // First messages
                System.out.println("Welcome to Shrek Colossal Adventure!");
                System.out.println("This game is a fan-game. Were not affiliated with Dreamworks Animation.");
                System.out.println("You'll play Shrek. We assume you know who he's because you play a fan-made game BASED on him.");
                System.out.println("Have fun playing.");
                break;
            case 2:
                // Shrek's House
                System.out.println("Shrek's house was a cozy, cluttered swamp shack.");
                System.out.println("A lumpy BAG slumped by the DOOR, brimming with who-knows-what");
                System.out.println("Inside, a rickety BED, patched with straw and blankets, creaked in the corner.");
                System.out.println("The smell of a hearty MEAL, possibly roasted slug stew, lingered in the air.");
                System.out.println("The wooden DOOR, slightly crooked on its hinges, groaned every time the swamp breeze pushed against it.");
                break;
            case 3:
                // Indication to go outside
                System.out.println("On a quiet swampy night, just outside Shrek's house, a strange noise drifted through the mist—haunting.");
                System.out.println("Whoever,or whatever, it was, it didn't sound friendly...");
                System.out.println("It might be interesting to go and see in the SWAMP");
                break;
            case 4:
                // Swamp's description
                System.out.println("A motley crowd had gathered in the swamp, their silhouettes flickering in the pale moonlight.");
                System.out.println("Fairytale creatures of all shapes and sizes stood ankle, deep in the murky water, gingerbread men with their gumball boutons," +
                        "three little pigs clutching makeshifts torches, and a few disgruntled dwarves muttering under their breath.");
                System.out.println("All eyes were fixed on Shrek's crooked door, as if awaiting some grand announcement, or daring rescue.");
                System.out.println("From the edge of the restless crowd stepped a mysterious figure cloaked in a patchwork of old scrolls and faded fabric.");
                System.out.println("The STORYTELLER, with eyes that seemed to hold a thousand tales, seemed to wait for the crowd to calm down before speaking.");
            case 5:
                // STORYTELLER's speech
                System.out.println("Their voice, rich and rhythmic, silenced the swamp as they addressed Shrek.");
                System.out.println("\"Shrek, the time has come. Laure de Farkual summons you,\" ");
                System.out.println("the Storyteller said, their tone grave yet tinged with mischief.");
                System.out.println("\"The fate of Far Far Away, and perhaps your quiet swamp, rests in your ... ogre hands.");
                System.out.println("In the distance, as the edge of a dark and dense FOREST, the trees seemed to whisper, as if they too were awaiting the start of a great adventure.");
            case 6:
                // Forest's description
                System.out.println("The FOREST was alive with soft, shimmering light that filtered through the thick canopy above.");
                System.out.println("The trees stood tall, their trunks gnarled and ancient, while delicate ferns and wildflowers carpeted the ground.");
                System.out.println("Every step Shrek took was muffled by the thick, mossy earth beneath his boots. The air was fresh, yet tinged with the sweet scent of wood and wild greenery.");
                System.out.println("Suddenly, a rustle in the bushes caught his attention. Out from the shadows sprang PUSSINBOOTS, his sharp eyes glinting mischievously.");
                System.out.println("With a swift flick of his tail, he landed gracefully on a nearby rock, striking a pose.");
                System.out.println("In the distance, a stone bridge arched gracefully over a bubbling stream, leading toward a looming ' that peeked through the trees, its tall towers barely visible above the treetops.");
            case 7:
                // PUSSINBOOTS' speech if we don't have 3 bottles of milk
                System.out.println("¿Purr...Mrrr... Meow? ¡Hisssss... Mrrrrroooww! Prrrttt... Meow, purr. ¡Mmmmm..... Hiss! Purr ... meow.");
                System.out.println("He looked at Shrek, giving a angry mrrrow as if to say,");
                System.out.println("\"I'm a little trusty, maybe if you have some bottles of milk it'll be better.");
            case 8:
                // PUSSINBOOTS' speech if we have 3 bottles of milk
                System.out.println("He looked at Shrek, then back toward the path ahead, with a ");
                System.out.println("Meow meooow~ meow =^-^=, as if to say"); // (Fyzoriel's idea)
                System.out.println("\"Maybe... I can go with you?\"");
            case 9:
                // BRIDGE's description
                System.out.println("Shrek stood at the edge of the old stone bridge, his broad shoulders casting a shadow in the fading light.");
                System.out.println("Across from him, LAUREDEFARKUAL and his knights stood poised, their armor gleaming, though the leader's expression was anything but friendly.");
                System.out.println("Farkual's eyes narrowed as she adjusted the pepper mill at his side, giving it a twist as though preparing for battle, though his posture remained stiff and pompous.");
                System.out.println("The knights clinked their armor, shifting nervously. Shrek stood unfazed, glaring back with a defiant growl, his fists ready.");
                System.out.println("The sound of the pepper mill turning echoed in the silence of the bridge, the tension rising with each click.");
            case 10:
                // LAUREDEFARKUAL's speech
                System.out.println("Her eyes glinted with a mix of arrogance and cold calculation as she fixed Shrek with a smug, calculating gaze.");
                System.out.println("\"Well, well, the ogre has finally arrived,\"");
                System.out.println("she purred, her voice smooth and venomous.");
                System.out.println("\"You have two choices, Shrek. You can choose to be blinded for life by this pepper, a punishment for those who dare challenge my authority. Or...\"");
                System.out.println("She paused, her lips curling into a sly smile.");
                System.out.println("\"You can go save FIONA, in Dragon's '. But know this, if you dare face me, you will never see again.\"");
                System.out.println("She flicked the pepper mill, and a cloud of dust swirled into the air.");
                System.out.println("\"Choose wisely, ogre. Your fate is in your hands.\"");
            case 11:
                // ''s description
                System.out.println("Shrek steeped into the grand hall of the ', the air thick.");
                System.out.println("The stone walls were lined with tapestries depicting scenes of battles long past, and the faint scent of dust hung in the air.");
                System.out.println("At the center of the room stood an old SIGN, its wood weathered but sturdy.");
                System.out.println("Written on it in bold letters was an inscription, but Shrek wasn't able to read it that far.");
                System.out.println("Beside the sign, on the cold stone floor, lay a rusty key, half-hidden beneath a patch of ivy that had crept in through the cracks.");
                System.out.println("The key looked ancient, its teeth worn down by time, but it gleamed with an eerie, almost magical light.");
                System.out.println("At the back of the room, a massive door loomed, its wooden frame intricately carved with symbols Shrek couldn't quite decipher.");
                System.out.println("The door seemed to lead up into the tower itself, its heavy frame creaking as if it hadn't been opened in years.");
                System.out.println("It was the only way forward, but the key... could it unlock something hidden within?");
            case 12:
                // SIGN's description
                System.out.println("The sign creaked as if it hadn't been touched in ages.");
                System.out.println("On it, scrawled in hasty, almost playful handwriting, was the following message:");
                System.out.println("\"Dragon and Donkey are out for the night. ");
                System.out.println("Don't expect them to save you from this unbearable woman upstairs. ");
                System.out.println("If you're wise, you'll stay down here.");
                System.out.println("But if you must go, the tower awaits. Just don't say you weren't warned...\"");
                System.out.println("Shrek stood in front of it, eyeing the words with skepticism.");
                System.out.println("\"Climb that tower? For an unbearable woman?\"");
                System.out.println("He grumbled, scratching his head.");
                System.out.println("\"This could get real ugly.\"");
            case 13:
                // TOWER's description
                System.out.println("Shrek's boots clattered against the cold stone steps as he climbed higher, the winding staircase stretching endlessly upward.");
                System.out.println("The walls of the tower seemed to close in on him, their rough surface scraping his shoulders as he ascended, each step more tiring than the last.");
                System.out.println("The air grew thicker, heavier with the scent of stale stone and a faint whiff of something floral, definitely not fresh air.");
                System.out.println("As he neared the top, a sharp, insistent voice pierced the silence, echoing down the tower like a ringing bell.");
                System.out.println("\"Who's there? Hello?! Do you know how long I've been stuck up here?!");
                System.out.println("If no one comes soon, I swear I'm going to—\"");
                System.out.println("The voice paused, and Shrek could almost hear the impatient tapping of feet from above.");
                System.out.println("He sighed, his patience already fraying. This was going to be a long one, he thought, gritting his teeth.");
                System.out.println("The more he climbed, the more it became clear: whoever this FIONA was, she was definitely demanding, her voice cutting through the stillness with each complaint.");
                System.out.println("She didn't know who was coming for her, but her tone was unmistakable, sharp, intolerant, as if every second in the tower was an unbearable ordeal.");
                System.out.println("Shrek growled under his breath.");
                System.out.println("\"I didn't sign up for a princess like this.\"");
                System.out.println("With each step, the weight of the climb seemed to match the growing sense of dread that filled him.");
                System.out.println("\"What kind of princess spends her time complaining instead of waiting to be rescued?\"");
                System.out.println("Finally, after what seemed like an eternity, he reached the top.");
                System.out.println("And there, in the silence of the tower, he could hear her voice again, this time louder, demanding, with a touch of irritation.");
                System.out.println("\"Whoever you are, it's about time you got here! I've been waiting forever, and now I—\"");
                System.out.println("Shrek couldn't help but mutter, \"This is gonna be one interesting rescue...\"");
                System.out.println("Shrek stood in the doorway, his eyes narrowing as he took in the figure before him.");
                System.out.println("Fiona stood with her arms crossed, tapping her foot impatiently, her eyes shooting daggers at him the moment their gazes met.");
                System.out.println("Her fiery red hair cascaded down in a tangled mess, not the elegant princess locks Shrek might have expected, but more a wild, untamed mane, clearly neglected from her time trapped in the tower.");
                System.out.println("She wore a green gown, but it was disheveled and frayed at the edges, as though she'd given up on trying to maintain her appearance long ago.");
                System.out.println("Her face, though striking in its own way, was framed by sharp features—high cheekbones, a strong jawline, and a slight furrow in her brow that suggested constant dissatisfaction.");
                System.out.println("Her eyes, though bright, had a hardened, unimpressed look to them, as if nothing and no one could possibly meet her standards.");
                System.out.println("\"Finally!\" she huffed, rolling her eyes dramatically. \"Took you long enough. I've been up here for ages, and you're the one who's supposed to rescue me? Really?\"");
                System.out.println("Her posture was stiff and defiant, as if she had been the one doing the saving all along.");
                System.out.println("Her lips twisted into a pout, and her eyes scanned Shrek up and down, as though inspecting him like a piece of moldy fruit.");
                System.out.println("\"Honestly, I expected someone more... dashing. What took you so long?!\"");
            case 14:
                // FIONA's speech
                System.out.println("\"You're late. I mean, really late.");
                System.out.println("Do you have any idea what it's like being stuck in this tower? No one to talk to, no one to look at, just stone and silence.");
                System.out.println("And do you know what the worst part is? ");
                System.out.println("I knew this was going to happen. I knew some bumbling, clueless idiot would show up, all slow and unprepared like you. ");
                System.out.println("I knew some bumbling, clueless idiot would show up, all slow and unprepared like you.");
                System.out.println("And now, here you are, looking like you just crawled out of a mud pit.\"");
                System.out.println("She rolled her eyes dramatically, her hands flying up in frustration.");
                System.out.println("\"I've been stuck up here for years, and what do I get?");
                System.out.println("Some ogre who thinks he's some kind of hero.");
                System.out.println("Please.");
                System.out.println("What am I supposed to do with you?");
                System.out.println("Rescue me?");
                System.out.println("Ha!");
                System.out.println("I\'ve had more interesting conversations with the walls.");
                System.out.println("You probably don’t even know how to open that door behind you, do you?\"");
                System.out.println("She took another sharp breath, her impatience practically radiating off her.");
                System.out.println("\"Honestly, I thought the rescue would be something worth waiting for, but no.");
                System.out.println("You’re just as disappointing as everyone else.");
                System.out.println("Figures.");
                System.out.println("Well, at least you're not like all those other men, leaving me for another chick.\"");
                System.out.println("she called, her tone dripping the sarcasm.");
                System.out.println("Well, at least you're not like all those other men, leaving me for another chick.");
                System.out.println("\"Not that it matters. I’m sure you'd only mess that up too.\"");;
            case 15:
                // Shrek's end (commande LEAVE)
                System.out.println("Shrek trudged back through the tower, his mind heavy with frustration.");
                System.out.println("The thought of Fiona, her endless complaints, her ungratefulness, her unbearable presence, gnawed at him with every step.");
                System.out.println("He couldn’t do it.");
                System.out.println("He couldn’t stay another minute in that tower with her.");
                System.out.println("Without a second thought, he turned his back on the princess and made his way down the stairs.");
                System.out.println("Let her stay up there, he thought bitterly.");
                System.out.println("She can deal with it.");
                System.out.println("As he reached the base of the tower, the harsh reality of his decision settled in.");
                System.out.println("The sound of Laure de Farkual’s voice snapped him out of his thoughts, and he knew what had to be done.");
                System.out.println("\"I've made my choice,\"");
                System.out.println("Shrek muttered, his voice low.");
                System.out.println("He looked up at Laure, standing tall on the bridge.");
                System.out.println("Blind me. It's better than living with that... unbearable woman.");
                System.out.println("Laure’s smile stretched wider, turning the pepper mill with satisfaction.");
                System.out.println("And so, Shrek left Fiona behind in her tower ; ");
                System.out.println("choosing the lesser pain—because sometimes, the escape from misery is worth the price of blindness.");
        }
    }
}