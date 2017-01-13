# solobure_native
ソロブレーンストーミング

開発時にはlocal.propertiesの下記のパスを書き換えること
sdk.dir=/Users/ono/Library/Android/sdk

mainactivityに下記を追加することで
chrom inspectでデバックが可能
solobura.setWebContentsDebuggingEnabled(true);
