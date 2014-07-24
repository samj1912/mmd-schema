.PHONY: clean

mb/mb.py: mmd-schema/schema/musicbrainz_mmd-2.0.rng
	java -jar /usr/share/java/trang.jar -I rng -O xsd mmd-schema/schema/musicbrainz_mmd-2.0.rng musicbrainz_mmd.xsd
	generateDS.py -o $@ -s mb/mb_mmd_subs.py --super="mb" --external-encoding="utf-8" --export="write etree" musicbrainz_mmd.xsd

clean:
	rm mb/mb.py mb/md_mmd_subs.py
