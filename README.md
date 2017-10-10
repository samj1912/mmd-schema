# mb-rngpy

Python bindings for the MusicBrainz RNG schema. Required by [sir](https://github.com/metabrainz/sir)

## Requirements

Please install the following packages/libs:

* [trang](https://code.google.com/archive/p/jing-trang/downloads)
* [generateDS](http://www.davekuhlman.org/generateDS.html)
* lxml (required for generateDS)

If you are on Ubuntu/Debian you can install trang via:
```bash
sudo apt-get install trang 
```

To install generateDS and lxml use
```bash
pip install -r requirements.txt
```

## Generating the files

To generate the files simply run

```bash
$ make mbrng/models.py
```
