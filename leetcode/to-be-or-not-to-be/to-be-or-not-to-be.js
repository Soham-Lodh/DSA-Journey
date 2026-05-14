/**
 * @param {string} val
 * @return {Object}
 */
var expect = function (val) {
    var toBe = function (nval) {
        if (val === nval) return true;
        throw new Error("Not Equal");
    }
    var notToBe = function (nval) {
        if (nval !== val) return true;
        throw new Error("Equal");
    }
    return { toBe, notToBe };
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */