package com.readify.api.bookpublishing.controller.updatechapter

import com.readify.bookpublishing.application.service.createchapter.ChapterStatus
import com.readify.bookpublishing.application.service.updatechapter.BookChapterUpdatedResponse
import com.readify.shared.domain.clock.Clock
import java.util.UUID

class ChapterUpdatedResponseMother {
    fun createWith(authorId: String, bookId: String, title: String = TITLE, content: String = CONTENT,
                   order: Int = ORDER, excerpt: String? = EXCERPT) =
        BookChapterUpdatedResponse(
            ID,
            title,
            content,
            Clock().now(),
            authorId,
            bookId,
            ChapterStatus.PUBLISHED,
            PRICE_AMOUNT,
            PRICE_CURRENCY,
            order,
            excerpt
        )

    companion object {
        private val ID = UUID.randomUUID().toString()
        private const val TITLE = "The boy who lived"
        private const val CONTENT =
            "Mr. and Mrs. Dursley, of number four, Privet Drive, \nwere proud to say that they were perfectly normal, \nthank you very much. They were the last people you’d \nexpect to be involved in anything strange or \nmysterious, because they just didn’t hold with such \nnonsense. \n\nMr. Dursley was the director of a firm called \nGrunnings, which made drills. He was a big, beefy \nman with hardly any neck, although he did have a \nvery large mustache. Mrs. Dursley was thin and \nblonde and had nearly twice the usual amount of \nneck, which came in very useful as she spent so \nmuch of her time craning over garden fences, spying \non the neighbors. The Dursley s had a small son \ncalled Dudley and in their opinion there was no finer \nboy anywhere. \n\nThe Dursleys had everything they wanted, but they \nalso had a secret, and their greatest fear was that \nsomebody would discover it. They didn’t think they \ncould bear it if anyone found out about the Potters. \nMrs. Potter was Mrs. Dursley’s sister, but they hadn’t \nmet for several years; in fact, Mrs. Dursley pretended \nshe didn’t have a sister, because her sister and her \ngood-for-nothing husband were as unDursleyish as it \nwas possible to be. The Dursleys shuddered to think \nwhat the neighbors would say if the Potters arrived in \nthe street. The Dursleys knew that the Potters had a \nsmall son, too, but they had never even seen him. \n\nThis boy was another good reason for keeping the \nPotters away; they didn’t want Dudley mixing with a \nchild like that. \n\nWhen Mr. and Mrs. Dursley woke up on the dull, gray \nTuesday our story starts, there was nothing about the \ncloudy sky outside to suggest that strange and \nmysterious things would soon be happening all over \nthe country. Mr. Dursley hummed as he picked out \nhis most boring tie for work, and Mrs. Dursley \ngossiped away happily as she wrestled a screaming \nDudley into his high chair. \n\nNone of them noticed a large, tawny owl flutter past \nthe window. \n\nAt half past eight, Mr. Dursley picked up his \nbriefcase, pecked Mrs. Dursley on the cheek, and \ntried to kiss Dudley good-bye but missed, because \nDudley was now having a tantrum and throwing his \ncereal at the walls. “Little tyke,” chortled Mr. Dursley \nas he left the house. He got into his car and backed \nout of number four’s drive. \n\nIt was on the corner of the street that he noticed the \nfirst sign of something peculiar — a cat reading a \nmap. For a second, Mr. Dursley didn’t realize what he \nhad seen — then he jerked his head around to look \nagain. There was a tabby cat standing on the corner \nof Privet Drive, but there wasn’t a map in sight. What \ncould he have been thinking of? It must have been a \ntrick of the light. Mr. Dursley blinked and stared at \nthe cat. It stared back. As Mr. Dursley drove around \nthe corner and up the road, he watched the cat in his \nmirror. It was now reading the sign that said Privet \nDrive — no, looking at the sign; cats couldn’t read \nmaps or signs. Mr. Dursley gave himself a little shake \nand put the cat out of his mind. As he drove toward \ntown he thought of nothing except a large order of \ndrills he was hoping to get that day. \n\nBut on the edge of town, drills were driven out of his \nmind by something else. As he sat in the usual \nmorning traffic jam, he couldn’t help noticing that \nthere seemed to be a lot of strangely dressed people \nabout. People in cloaks. Mr. Dursley couldn’t bear \npeople who dressed in funny clothes — the getups \nyou saw on young people! He supposed this was some \nstupid new fashion. He drummed his fingers on the \nsteering wheel and his eyes fell on a huddle of these \nweirdos standing quite close by. They were whispering \nexcitedly together. Mr. Dursley was enraged to see \nthat a couple of them weren’t young at all; why, that \nman had to be older than he was, and wearing an \nemerald-green cloak! The nerve of him! But then it \nstruck Mr. Dursley that this was probably some silly \nstunt — these people were obviously collecting for \nsomething ... yes, that would be it. The traffic moved \non and a few minutes later, Mr. Dursley arrived in the \nGrunnings parking lot, his mind back on drills. \n\nMr. Dursley always sat with his back to the window in \nhis office on the ninth floor. If he hadn’t, he might \nhave found it harder to concentrate on drills that \nmorning. He didn’t see the owls swooping past in \nbroad daylight, though people down in the street did; \nthey pointed and gazed open-mouthed as owl after \nowl sped overhead. Most of them had never seen an \nowl even at nighttime. Mr. Dursley, however, had a \nperfectly normal, owl-free morning. He yelled at five \ndifferent people. He made several important telephone\ncalls and shouted a bit more. He was in a very good \nmood until lunchtime, when he thought he’d stretch \nhis legs and walk across the road to buy himself a \nbun from the bakery. \n\nHe’d forgotten all about the people in cloaks until he \npassed a group of them next to the baker’s. He eyed \nthem angrily as he passed. He didn’t know why, but \nthey made him uneasy. This bunch were whispering \nexcitedly, too, and he couldn’t see a single collecting \ntin. It was on his way back past them, clutching a \nlarge doughnut in a bag, that he caught a few words \nof what they were saying. \n\n“The Potters, that’s right, that’s what I heard — ” \n\n“ — yes, their son, Harry — ” \n\nMr. Dursley stopped dead. Fear flooded him. He \nlooked back at the whisperers as if he wanted to say \nsomething to them, but thought better of it. \n\nHe dashed back across the road, hurried up to his \noffice, snapped at his secretary not to disturb him, \nseized his telephone, and had almost finished dialing \nhis home number when he changed his mind. He put \nthe receiver back down and stroked his mustache, \nthinking ... no, he was being stupid. Potter wasn’t \nsuch an unusual name. He was sure there were lots \nof people called Potter who had a son called Harry. \nCome to think of it, he wasn’t even sure his nephew \nwas called Harry. He’d never even seen the boy. It \nmight have been Harvey. Or Harold. There was no \npoint in worrying Mrs. Dursley; she always got so \nupset at any mention of her sister. He didn’t blame \nher — if he’d had a sister like that ... but all the \nsame, those people in cloaks ... \n\nHe found it a lot harder to concentrate on drills that \nafternoon and when he left the building at five o’clock, \nhe was still so worried that he walked straight into \nsomeone just outside the door. \n\n“Sorry,” he grunted, as the tiny old man stumbled \nand almost fell. It was a few seconds before Mr. \nDursley realized that the man was wearing a violet \ncloak. He didn’t seem at all upset at being almost \nknocked to the ground. On the contrary, his face split \ninto a wide smile and he said in a squeaky voice that \nmade passersby stare, “Don’t be sorry, my dear sir, \nfor nothing could upset me today! Rejoice, for You- \nKnow-Who has gone at last! Even Muggles like \nyourself should be celebrating, this happy, happy \nday!” \n\nAnd the old man hugged Mr. Dursley around the \nmiddle and walked off. \n\nMr. Dursley stood rooted to the spot. He had been \nhugged by a complete stranger. He also thought he \nhad been called a Muggle, whatever that was. He was \nrattled. He hurried to his car and set off for home, \nhoping he was imagining things, which he had never \nhoped before, because he didn’t approve of \nimagination. \n\nAs he pulled into the driveway of number four, the \nfirst thing he saw — and it didn’t improve his mood — \nwas the tabby cat he’d spotted that morning. It was \nnow sitting on his garden wall. He was sure it was the \nsame one; it had the same markings around its eyes. \n\n“Shoo!” said Mr. Dursley loudly. \n\nThe cat didn’t move. It just gave him a stern look. \n\nWas this normal cat behavior? Mr. Dursley wondered. \nTrying to pull himself together, he let himself into the\nhouse. He was still determined not to mention \nanything to his wife. \n\nMrs. Dursley had had a nice, normal day. She told \nhim over dinner all about Mrs. Next Door’s problems \nwith her daughter and how Dudley had learned a new \nword (“Won’t!”). Mr. Dursley tried to act normally. \nWhen Dudley had been put to bed, he went into the \nliving room in time to catch the last report on the \nevening news: \n\n“And finally, bird-watchers everywhere have reported \nthat the nation’s owls have been behaving very \nunusually today. Although owls normally hunt at \nnight and are hardly ever seen in daylight, there have \nbeen hundreds of sightings of these birds flying in \nevery direction since sunrise. Experts are unable to \nexplain why the owls have suddenly changed their \nsleeping pattern.” The newscaster allowed himself a \ngrin. “Most mysterious. And now, over to Jim \nMcGuffin with the weather. Going to be any more \nshowers of owls tonight, Jim?” \n\n“Well, Ted,” said the weatherman, “I don’t know about \nthat, but it’s not only the owls that have been acting \noddly today. Viewers as far apart as Kent, Yorkshire, \nand Dundee have been phoning in to tell me that \ninstead of the rain I promised yesterday, they’ve had a \ndownpour of shooting stars! Perhaps people have \nbeen celebrating Bonfire Night early — it’s not until \nnext week, folks! But I can promise a wet night \ntonight.” \n\nMr. Dursley sat frozen in his armchair. Shooting stars \nall over Britain? Owls flying by daylight? Mysterious \npeople in cloaks all over the place? And a whisper, a \nwhisper about the Potters...\n\nMrs. Dursley came into the living room carrying two \ncups of tea. It was no good. He’d have to say \nsomething to her. He cleared his throat nervously. “Er \n— Petunia, dear — you haven’t heard from your sister \nlately, have you?” \n\nAs he had expected, Mrs. Dursley looked shocked and \nangry. After all, they normally pretended she didn’t \nhave a sister. \n\n“No,” she said sharply. “Why?” \n\n“Funny stuff on the news,” Mr. Dursley mumbled. \n“Owls . . . shooting stars . . . and there were a lot of \nfunny-looking people in town today ...” \n\n“So?” snapped Mrs. Dursley. \n\n“Well, I just thought ... maybe ... it was something to \ndo with ... you know ... her crowd.” \n\nMrs. Dursley sipped her tea through pursed lips. Mr. \nDursley wondered whether he dared tell her he’d \nheard the name “Potter.” He decided he didn’t dare. \nInstead he said, as casually as he could, “Their son — \nhe’d be about Dudley’s age now, wouldn’t he?” \n\n“I suppose so,” said Mrs. Dursley stiffly. \n\n“What’s his name again? Howard, isn’t it?” \n\n“Harry. Nasty, common name, if you ask me.” \n\n“Oh, yes,” said Mr. Dursley, his heart sinking \nhorribly. “Yes, I quite agree.” \n\nHe didn’t say another word on the subject as they \nwent upstairs to bed. While Mrs. Dursley was in the \nbathroom, Mr. Dursley crept to the bedroom window\nand peered down into the front garden. The cat was \nstill there. It was staring down Privet Drive as though \nit were waiting for something. \n\nWas he imagining things? Could all this have \nanything to do with the Potters? If it did ... if it got out \nthat they were related to a pair of — well, he didn’t \nthink he could bear it. \n\nThe Dursleys got into bed. Mrs. Dursley fell asleep \nquickly but Mr. Dursley lay awake, turning it all over \nin his mind. His last, comforting thought before he fell \nasleep was that even if the Potters were involved, \nthere was no reason for them to come near him and \nMrs. Dursley. The Potters knew very well what he and \nPetunia thought about them and their kind. ... He \ncouldn’t see how he and Petunia could get mixed up \nin anything that might be going on — he yawned and \nturned over — it couldn’t affect them. ... \n\nHow very wrong he was. \n\nMr. Dursley might have been drifting into an uneasy \nsleep, but the cat on the wall outside was showing no \nsign of sleepiness. It was sitting as still as a statue, \nits eyes fixed unblinkingly on the far corner of Privet \nDrive. It didn’t so much as quiver when a car door \nslammed on the next street, nor when two owls \nswooped overhead. In fact, it was nearly midnight \nbefore the cat moved at all. \n\nA man appeared on the corner the cat had been \nwatching, appeared so suddenly and silently you’d \nhave thought he’d just popped out of the ground. The \ncat’s tail twitched and its eyes narrowed. \n\nNothing like this man had ever been seen on Privet \nDrive. He was tall, thin, and very old, judging by the \nsilver of his hair and beard, which were both long\nenough to tuck into his belt. He was wearing long \nrobes, a purple cloak that swept the ground, and \nhigh-heeled, buckled boots. His blue eyes were light, \nbright, and sparkling behind half-moon spectacles \nand his nose was very long and crooked, as though it \nhad been broken at least twice. This man’s name was \nAlbus Dumbledore. \n\nAlbus Dumbledore didn’t seem to realize that he had \njust arrived in a street where everything from his \nname to his boots was unwelcome. He was busy \nrummaging in his cloak, looking for something. But \nhe did seem to realize he was being watched, because \nhe looked up suddenly at the cat, which was still \nstaring at him from the other end of the street. For \nsome reason, the sight of the cat seemed to amuse \nhim. He chuckled and muttered, “I should have \nknown.” \n\nHe found what he was looking for in his inside \npocket. It seemed to be a silver cigarette lighter. He \nflicked it open, held it up in the air, and clicked it. \nThe nearest street lamp went out with a little pop. He \nclicked it again — the next lamp flickered into \ndarkness. Twelve times he clicked the Put-Outer, \nuntil the only lights left on the whole street were two \ntiny pinpricks in the distance, which were the eyes of \nthe cat watching him. If anyone looked out of their \nwindow now, even beady-eyed Mrs. Dursley, they \nwouldn’t be able to see anything that was happening \ndown on the pavement. Dumbledore slipped the Put- \nOuter back inside his cloak and set off down the \nstreet toward number four, where he sat down on the \nwall next to the cat. He didn’t look at it, but after a \nmoment he spoke to it. \n\n“Fancy seeing you here, Professor McGonagall.” \n\nHe turned to smile at the tabby, but it had gone. \nInstead he was smiling at a rather severe-looking \nwoman who was wearing square glasses exactly the \nshape of the markings the cat had had around its \neyes. She, too, was wearing a cloak, an emerald one. \nHer black hair was drawn into a tight bun. She \nlooked distinctly ruffled. \n\n“How did you know it was me?” she asked. \n\n“My dear Professor, I’ve never seen a cat sit so stiffly.” \n\n“You’d be stiff if you’d been sitting on a brick wall all \nday,” said Professor McGonagall. \n\n“All day? When you could have been celebrating? I \nmust have passed a dozen feasts and parties on my \nway here.” \n\nProfessor McGonagall sniffed angrily. \n\n“Oh yes, everyone’s celebrating, all right,” she said \nimpatiently. “You’d think they’d be a bit more careful, \nbut no — even the Muggles have noticed something’s \ngoing on. It was on their news.” She jerked her head \nback at the Dursleys’ dark living-room window. “I \nheard it. Flocks of owls ... shooting stars. ... Well, \nthey’re not completely stupid. They were bound to \nnotice something. Shooting stars down in Kent — I’ll \nbet that was Dedalus Diggle. He never had much \nsense.” \n\n“You can’t blame them,” said Dumbledore gently. \n“We’ve had precious little to celebrate for eleven \nyears.” \n\n“I know that,” said Professor McGonagall irritably. \n\n“But that’s no reason to lose our heads. People are \nbeing downright careless, out on the streets in broad\ndaylight, not even dressed in Muggle clothes, \nswapping rumors.” \n\nShe threw a sharp, sideways glance at Dumbledore \nhere, as though hoping he was going to tell her \nsomething, but he didn’t, so she went on. “A fine \nthing it would be if, on the very day You-Know-Who \nseems to have disappeared at last, the Muggles found \nout about us all. I suppose he really has gone, \nDumbledore?” \n\n“It certainly seems so,” said Dumbledore. “We have \nmuch to be thankful for. Would you care for a lemon \ndrop?” \n\n“A what?” \n\n“A lemon drop. They’re a kind of Muggle sweet I’m \nrather fond of.” \n\n“No, thank you,” said Professor McGonagall coldly, as \nthough she didn’t think this was the moment for \nlemon drops. “As I say, even if You-Know-Who has \ngone — ” \n\n“My dear Professor, surely a sensible person like \nyourself can call him by his name? All this You- \nKnow-Who’ nonsense — for eleven years I have been \ntrying to persuade people to call him by his proper \nname: Voldemort.” Professor McGonagall flinched, but \nDumbledore, who was unsticking two lemon drops, \nseemed not to notice. “It all gets so confusing if we \nkeep saying You-Know-Who.’ I have never seen any \nreason to be frightened of saying Voldemort’s name.” \n\n“I know you haven’t,” said Professor McGonagall, \nsounding half exasperated, half admiring. “But you’re \ndifferent. Everyone knows you’re the only one You- \nKnow- oh, all right, Voldemort, was frightened of.” \n\n“You flatter me,” said Dumbledore calmly. “Voldemort \nhad powers I will never have.”\n\n“Only because you’re too — well — noble to use \nthem.” \n\n“It’s lucky it’s dark. I haven’t blushed so much since \nMadam Pomfrey told me she liked my new earmuffs.” \n\nProfessor McGonagall shot a sharp look at \nDumbledore and said, “The owls are nothing next to \nthe rumors that are flying around. You know what \neveryone’s saying? About why he’s disappeared? \n\nAbout what finally stopped him?” \n\nIt seemed that Professor McGonagall had reached the \npoint she was most anxious to discuss, the real \nreason she had been waiting on a cold, hard wall all \nday, for neither as a cat nor as a woman had she \nfixed Dumbledore with such a piercing stare as she \ndid now. It was plain that whatever “everyone” was \nsaying, she was not going to believe it until \nDumbledore told her it was true. Dumbledore, \nhowever, was choosing another lemon drop and did \nnot answer. \n\n“What they’re saying,” she pressed on, “is that last \nnight Voldemort turned up in Godric’s Hollow. He \nwent to find the Potters. The rumor is that Lily and \nJames Potter are — are — that they’re — dead.” \n\nDumbledore bowed his head. Professor McGonagall \ngasped. \n\n“Lily and James ... I can’t believe it ... I didn’t want to \nbelieve it ... Oh, Albus ...” \n\nDumbledore reached out and patted her on the \nshoulder. “I know ... I know ...” he said heavily. \n\nProfessor McGonagall’s voice trembled as she went \non. “That’s not all. They’re saying he tried to kill the \nPotters’ son, Harry. But — he couldn’t. He couldn’t \nkill that little boy. No one knows why, or how, but \nthey’re saying that when he couldn’t kill Harry Potter, \nVoldemort’s power somehow broke — and that’s why \nhe’s gone.” \n\nDumbledore nodded glumly. \n\n“It’s — it’s true?” faltered Professor McGonagall. “After \nall he’s done ... all the people he’s killed ... he couldn’t \nkill a little boy? It’s just astounding ... of all the \nthings to stop him . . . but how in the name of heaven \ndid Harry survive?” \n\n“We can only guess,” said Dumbledore. “We may \nnever know.” \n\nProfessor McGonagall pulled out a lace handkerchief \nand dabbed at her eyes beneath her spectacles. \nDumbledore gave a great sniff as he took a golden \nwatch from his pocket and examined it. It was a very \nodd watch. It had twelve hands but no numbers; \ninstead, little planets were moving around the edge. It \nmust have made sense to Dumbledore, though, \nbecause he put it back in his pocket and said, \n“Hagrid’s late. I suppose it was he who told you I’d be \nhere, by the way?” \n\n“Yes,” said Professor McGonagall. “And I don’t \nsuppose you’re going to tell me why you’re here, of all \nplaces?” \n\n“I’ve come to bring Harry to his aunt and uncle. \nThey’re the only family he has left now.” \n\n“You don’t mean — you can’t mean the people who \nlive here?” cried Professor McGonagall, jumping to her\nfeet and pointing at number four. “Dumbledore — you \ncan’t. I’ve been watching them all day. You couldn’t \nfind two people who are less like us. And they’ve got \nthis son — I saw him kicking his mother all the way \nup the street, screaming for sweets. Harry Potter \ncome and live here!” \n\n“It’s the best place for him,” said Dumbledore firmly. \n“His aunt and uncle will be able to explain everything \nto him when he’s older. I’ve written them a letter.” \n\n“A letter?” repeated Professor McGonagall faintly, \nsitting back down on the wall. “Really, Dumbledore, \nyou think you can explain all this in a letter? These \npeople will never understand him! He’ll be famous — \na legend — I wouldn’t be surprised if today was \nknown as Harry Potter Day in the future — there will \nbe books written about Harry — every child in our \nworld will know his name!” \n\n“Exactly,” said Dumbledore, looking very seriously \nover the top of his half-moon glasses. “It would be \nenough to turn any boy’s head. Famous before he can \nwalk and talk! Famous for something he won’t even \nremember! Can’t you see how much better off he’ll be, \ngrowing up away from all that until he’s ready to take \nit?”\n\nProfessor McGonagall opened her mouth, changed her \nmind, swallowed, and then said, “Yes — yes, you’re \nright, of course. But how is the boy getting here, \nDumbledore?” She eyed his cloak suddenly as though \nshe thought he might be hiding Harry underneath it. \n\n“Hagrid’s bringing him.” \n\n“You think it — wise — to trust Hagrid with \nsomething as important as this?” \n\n“I would trust Hagrid with my life,” said Dumbledore. \n\n“I’m not saying his heart isn’t in the right place,” said \nProfessor McGonagall grudgingly, “but you can’t \npretend he’s not careless. He does tend to — what \nwas that?” \n\nA low rumbling sound had broken the silence around \nthem. It grew steadily louder as they looked up and \ndown the street for some sign of a headlight; it \nswelled to a roar as they both looked up at the sky — \nand a huge motorcycle fell out of the air and landed \non the road in front of them. \n\nIf the motorcycle was huge, it was nothing to the man \nsitting astride it. He was almost twice as tall as a \nnormal man and at least five times as wide. He looked \nsimply too big to be allowed, and so wild — long \ntangles of bushy black hair and beard hid most of his \nface, he had hands the size of trash can lids, and his \nfeet in their leather boots were like baby dolphins. In \nhis vast, muscular arms he was holding a bundle of \nblankets. \n\n“Hagrid,” said Dumbledore, sounding relieved. “At \nlast. And where did you get that motorcycle?” \n\n“Borrowed it, Professor Dumbledore, sir,” said the \ngiant, climbing carefully off the motorcycle as he \nspoke. “Young Sirius Black lent it to me. I’ve got him, \nsir.” \n\n“No problems, were there?” \n\n“No, sir — house was almost destroyed, but I got him \nout all right before the Muggles started swarmin’ \naround. He fell asleep as we was flyin’ over Bristol.” \n\nDumbledore and Professor McGonagall bent forward \nover the bundle of blankets. Inside, just visible, was a \nbaby boy, fast asleep. Under a tuft of jet-black hair \nover his forehead they could see a curiously shaped \ncut, like a bolt of lightning. \n\n“Is that where — ?” whispered Professor McGonagall. \n\n“Yes,” said Dumbledore. “Hell have that scar forever.” \n\n“Couldn’t you do something about it, Dumbledore?” \n\n“Even if I could, I wouldn’t. Scars can come in handy. \n\nI have one myself above my left knee that is a perfect \nmap of the London Underground. Well — give him \nhere, Hagrid — we’d better get this over with.” \n\nDumbledore took Harry in his arms and turned \ntoward the Dursleys’ house. \n\n“Could I — could I say good-bye to him, sir?” asked \nHagrid. He bent his great, shaggy head over Harry \nand gave him what must have been a very scratchy, \nwhiskery kiss. Then, suddenly, Hagrid let out a howl \nlike a wounded dog. \n\n“Shhh!” hissed Professor McGonagall, “you’ll wake the \nMuggles!” \n\n“S-s-sorry,” sobbed Hagrid, taking out a large, spotted \nhandkerchief and burying his face in it. “But I c-c- \ncan’t stand it — Lily an’ James dead — an’ poor little \nHarry off ter live with Muggles — ” \n\n“Yes, yes, it’s all very sad, but get a grip on yourself, \nHagrid, or we’ll be found,” Professor McGonagall \nwhispered, patting Hagrid gingerly on the arm as \nDumbledore stepped over the low garden wall and \nwalked to the front door. He laid Harry gently on the \ndoorstep, took a letter out of his cloak, tucked it \ninside Harry’s blankets, and then came back to the \nother two. For a full minute the three of them stood \nand looked at the little bundle; Hagrid’s shoulders \nshook, Professor McGonagall blinked furiously, and \nthe twinkling light that usually shone from \nDumbledore’s eyes seemed to have gone out. \n\n“Well,” said Dumbledore finally, “that’s that. We’ve no \nbusiness staying here. We may as well go and join the \ncelebrations.” \n\n“Yeah,” said Hagrid in a very muffled voice, “I’d best \nget this bike away. G ’night, Professor McGonagall — \nProfessor Dumbledore, sir.” \n\nWiping his streaming eyes on his jacket sleeve, Hagrid \nswung himself onto the motorcycle and kicked the \nengine into life; with a roar it rose into the air and off \ninto the night. \n\n“I shall see you soon, I expect, Professor McGonagall,” \nsaid Dumbledore, nodding to her. Professor \nMcGonagall blew her nose in reply. \n\nDumbledore turned and walked back down the street. \nOn the corner he stopped and took out the silver Put- \nOuter. He clicked it once, and twelve balls of light \nsped back to their street lamps so that Privet Drive \nglowed suddenly orange and he could make out a \ntabby cat slinking around the corner at the other end \nof the street. He could just see the bundle of blankets \non the step of number four. \n\n“Good luck, Harry,” he murmured. He turned on his \nheel and with a swish of his cloak, he was gone. \n\nA breeze ruffled the neat hedges of Privet Drive, which \nlay silent and tidy under the inky sky, the very last \n\nplace you would expect astonishing things to happen. \nHarry Potter rolled over inside his blankets without \nwaking up. One small hand closed on the letter \nbeside him and he slept on, not knowing he was \nspecial, not knowing he was famous, not knowing he \nwould be woken in a few hours’ time by Mrs. \n\nDursley’s scream as she opened the front door to put \nout the milk bottles, nor that he would spend the next \nfew weeks being prodded and pinched by his cousin \nDudley. ... He couldn’t know that at this very \nmoment, people meeting in secret all over the country \nwere holding up their glasses and saying in hushed \nvoices: “To Harry Potter — the boy who lived!”"
        private const val PRICE_AMOUNT = 1.3f
        private const val PRICE_CURRENCY = "EUR"
        private const val ORDER = 1
        private const val EXCERPT = "How Harry Potter became famous"
    }
}
